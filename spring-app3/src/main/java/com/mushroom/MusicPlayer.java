package com.mushroom;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        System.out.println("Playing: "+musicList.get(new Random()
                .nextInt(3))
                .getSong());
    }
}
