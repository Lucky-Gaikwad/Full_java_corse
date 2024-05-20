package com.example.PolymorphismChallanges2;

import com.example.PolymorphismChallanges1.Calculator;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle veh = new Vehicle();
        car.service();
        veh.service();
    }
}
