package com.example.LambdaChallange1;

import java.util.function.BinaryOperator;

public class LambdaMultiplicaton {
    public static void main(String[] args) {
       BinaryOperator<Integer> multi =  (a,b) -> a * b;
       int result = multi.apply(4,5);
       System.out.printf("Sum of the numbers: %d",result);
    }

}
