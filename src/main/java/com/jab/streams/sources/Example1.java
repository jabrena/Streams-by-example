package com.jab.streams.sources;

import java.util.Arrays;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        List<String> myFirstStream = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myFirstStream.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
