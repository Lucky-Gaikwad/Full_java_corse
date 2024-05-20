package com.example.ExecutorServiceChallange1;

public class PrintNumbers implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("\nNumber is %d" , i+1);
        }
    }
}
