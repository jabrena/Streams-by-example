package com.jab.streams.sources;

import java.util.Arrays;

public class Example2 {

    public static void main(String[] args) {

        Arrays.asList("a1", "a2", "a3")
            .stream()
            .findFirst()
            .ifPresent(System.out::println);
    }

}
