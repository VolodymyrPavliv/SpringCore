package com.mushroom;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private final List<String> classicalList = Arrays.asList("classicalMusic1",
            "classicalMusic2", "classicalMusic3");
    @Override
    public String getSong() {
        return classicalList.get(new Random(0)
                .nextInt(3));
    }
}
