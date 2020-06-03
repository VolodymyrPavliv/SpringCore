package com.mushroom;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        
        System.out.println("Name: "+musicPlayer.getName());
        System.out.println("Volume: "+musicPlayer.getVolume());
        musicPlayer.playMusic();

        context.close();
    }
}
