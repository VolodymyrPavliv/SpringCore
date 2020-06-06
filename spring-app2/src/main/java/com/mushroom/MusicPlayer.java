package com.mushroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("rockMusic")
    private Music music1;

    @Autowired
    @Qualifier("hipHopMusic")
    private Music music2;

    @Autowired
    @Qualifier("classicalMusic")
    private Music music3;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(){}

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic(MusicKind musicKind){
        String result = "Playing: ";
        switch (musicKind){
            case ROCK: result+= music1.getSong();
            break;
            case HIPHOP: result+= music2.getSong();
            break;
            case CLASSICAL: result+= music3.getSong();
        }
        return result;
    }
}
