package com.example.LambdaChallange3;

import java.util.List;

public class StringFilterAndConcatenate {
    public static void main(String[] args) {
        List<String> strs = List.of("Abhishek Gaikwad", "Hello guys I am Abhishek", 
        "My second name is lucky.", "Did you like my name Lucky.", "Ashish", "Lucky", "Anuj");

        String result = strs.stream()
        .filter(str -> str.length() > 10)
        .reduce("", (a,b) -> a + " " + b);

        System.out.println(result);
    }

}
