package com.jab.streams.parallel;

import lombok.extern.slf4j.Slf4j;
import java.util.stream.IntStream;

public @Slf4j class Example10 {

    public static boolean isPrime(int value) {
        for (int i = 2; i * i <= value; ++i)
            if (value % i == 0) return false;
        return true;
    }

    public static long testLoop(int bound) {

        long startTime = System.nanoTime();

        long count = 0;
        for (int i = 2; i < bound; ++i) {
            if (isPrime(i)){
                ++count;
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        log.debug("Process time: {}", duration);
        return count;
    }

    public static long testStream(int bound) {
        long startTime = System.nanoTime();

        long count =  IntStream.range(2, bound).filter(Example10::isPrime).count();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        log.debug("Process time: {}", duration);
        return count;
    }

    public static long testParallel(int bound) {
        long startTime = System.nanoTime();

        long count =   IntStream.range(2, bound).parallel().filter(Example10::isPrime).count();

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        log.debug("Process time: {}", duration);
        return count;
    }

    public static void main(String[] args) {

        int number = 2;
        for(int x= 0; x <= 25; x++){
            log.info("Iteration: {}", x);
            log.info("Value to simulate: number^x={}", (int) Math.pow(number, x));
            log.info("Loop result: {}", testLoop( (int) Math.pow(number, x)));
            log.info("Stream result: {}", testStream( (int) Math.pow(number, x)));
            log.info("Parallel result: {}", testParallel( (int) Math.pow(number, x)));
        }

    }
}
