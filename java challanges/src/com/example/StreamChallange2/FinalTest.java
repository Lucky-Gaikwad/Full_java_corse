package com.example.StreamChallange2;

import java.util.List;

public class FinalTest {
    public static void main(String[] args) {
        List<String> numbers = List.of("1","2","3","4","5");
        numbers.stream()
        //.map(str -> Integer.parseInt(str))
        //Another way
        .map(Integer::parseInt)
        .map(num -> Math.pow(num, 2))
        .reduce((a,b) -> a+b)
        .ifPresent(System.out::println);

    }

}