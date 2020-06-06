package com.mushroom;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    private final List<String> rockList = Arrays.asList("rockMusic1",
            "rockMusic2", "rockMusic3");
    @Override
    public String getSong() {
        return rockList.get(new Random()
                .nextInt(3));
    }
}
