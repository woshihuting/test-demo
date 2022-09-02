package com.example.demo.service;


import com.example.demo.pojo.Music;

public interface MusicService {

    public void insertMusic(Music music);

    public Music getMusicById(Long musicId);


}
