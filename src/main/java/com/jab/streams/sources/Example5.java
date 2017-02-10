package com.jab.streams.sources;

import java.util.Arrays;

public class Example5 {

    public static void main(String[] args) {

        Arrays.stream(new int[] {1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);
    }

}
