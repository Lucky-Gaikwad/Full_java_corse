package com.example.ExceptionalHeadling;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator...");
        System.out.println("Plese enter your first number: ");
        int first = input.nextInt();
        System.out.println("Please enter your second number: ");
        int second = input.nextInt();

        try {
            int result = first / second;
            System.out.printf("Result is %d", result);
        } catch (ArithmeticException exception) {
            if (exception.getMessage().equals("/ by zero")) {
                System.out.println("Divide by zero occurred");
            } else {
                throw exception;
            }
        }
    }
}
