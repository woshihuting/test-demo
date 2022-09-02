package com.example.demo.service.impl;


import com.example.demo.dao.MusicMapper;
import com.example.demo.pojo.Music;
import com.example.demo.service.MusicService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class MusicServiceImpl implements MusicService {

    @Resource
    private MusicMapper musicMapper;
    @Override
    public void insertMusic(Music music) {
        musicMapper.insert(music);
    }

    @Override
    //@CacheEvict( value = "music", key = "'musicId:'+#musicId") 清redis緩存
    @Cacheable( value = "music", key = "'musicId:'+#musicId", unless = "#result == null")
    //@CachePut( value = "music", key = "'musicId:'+#musicId", unless = "#result == null") // 查询数据库并存入缓存
    public Music getMusicById(Long musicId) {
        Map map = new HashMap();
        map.put("musicId",musicId);
        return musicMapper.selectByPrimaryKey(musicId);
    }
}
