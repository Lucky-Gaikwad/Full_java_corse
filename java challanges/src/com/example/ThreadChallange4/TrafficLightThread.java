package com.example.ThreadChallange4;

import java.lang.RuntimeException;

public class TrafficLightThread extends Thread{
    private final TrafficColor color;

    public TrafficLightThread(TrafficColor color) {
        this.color = color;
    }

    public void run() {
        System.out.printf("%s active\n", color);
        try {
            Thread.sleep(color.getOnTimeInMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
            // TODO: handle exception
        }
        System.out.printf("%s Inactive\n", color);
    }


}
