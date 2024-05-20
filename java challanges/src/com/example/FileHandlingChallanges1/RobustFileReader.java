package com.example.FileHandlingChallanges1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the file you wish to read:  ");
        String fileName = input.next();

        try (FileReader reader = new FileReader(fileName)) {
            int read;
            while ((read = reader.read()) != -1);
            System.out.println((char)read);
        } catch (FileNotFoundException exception) {
            System.out.print("File not found exception");
        }
        catch (IOException exception) {/*
            if (exception instanceof FileNotFoundException) {

            }*/ // It's another way to do this exception. But that way is quite understandable ratherthan this.
            System.out.printf("Exception occurred: %s", exception.getMessage());
        }
    }
}
