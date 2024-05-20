package com.example.ThreadChallange2;

import java.lang.RuntimeException;

public class ThreadState extends Thread{ 
    
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("\nFrom inside run %s", Thread.currentThread().getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
