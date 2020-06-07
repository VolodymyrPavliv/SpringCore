package com.mushroom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public List<Music> musicList(){
        return Arrays.asList(new RockMusic(),new HipHopMusic(),new ClassicalMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }
}
