package com.example.demo.controller;

import com.example.demo.pojo.Music;
import com.example.demo.service.MusicService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;


@RestController
@RequestMapping("/music")
public class MusicController {
    private static final Logger logger = LoggerFactory.getLogger(MusicController.class);

    @Resource
    private MusicService musicService;
    @Resource
    private AmqpTemplate rabbitTemplate;

    @GetMapping("/getMusicById")
    @ResponseBody
    public Music getMusicById(@PathParam("") Long musicId ){
        rabbitTemplate.convertAndSend("music:"+musicId.toString());
        return  musicService.getMusicById(musicId) ;
    }

    @PostMapping("/insertMusic")
    @ResponseBody
    public void insertMusic(@RequestBody Music music){
        musicService.insertMusic(music);
    }
}
