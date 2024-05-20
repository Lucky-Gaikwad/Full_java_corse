package com.example.ExecutorServiceChallange3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestingFactorial {
    public static void main(String[] args) {
       try( ExecutorService  service = Executors.newFixedThreadPool(3)) {
        List<Future<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            FactorialCalculator task = new FactorialCalculator(i);
            list.add(service.submit(task));
        }

        for (Future<Integer> future : list) {
            System.out.printf("\n Result is: %d", future.get());
            
        }

        service.shutdown();

        if (service.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("\n BOHUT HUA AB CHOODO...");
            service.shutdownNow();            
        }


       } catch (InterruptedException | ExecutionException e) {
        throw new RuntimeException(e);
       }
    }

}
