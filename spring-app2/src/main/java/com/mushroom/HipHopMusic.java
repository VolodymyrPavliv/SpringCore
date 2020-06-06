package com.mushroom;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class HipHopMusic implements Music {
    private final List<String> hipHopList = Arrays.asList("hipHopMusic1",
            "hipHopMusic2", "hipHopMusic3");
    @Override
    public String getSong() {
        return hipHopList.get(new Random(0)
                .nextInt(3));
    }
}
