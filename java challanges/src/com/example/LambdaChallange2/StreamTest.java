package com.example.LambdaChallange2;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = List.of("Lucky", "Abhishek", "Chicky");
        names.stream()
        .forEach(name -> System.out.println(name));
    }

}
