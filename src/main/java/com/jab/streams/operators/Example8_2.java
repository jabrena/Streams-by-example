package com.jab.streams.operators;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Example8_2 {

    public static void main(String[] args) {

        Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(List::stream)
                .map(integer -> integer + 1)
                .collect(Collectors.toList())
                .stream()
                .forEach(System.out::println);
    }

}
