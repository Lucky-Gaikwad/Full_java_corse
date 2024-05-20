package com.example.PackagesChallanges1.utilx;

import com.example.PackagesChallanges1.geometry.Circle;
import com.example.PackagesChallanges1.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(18,15);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rect.breath * rect.length;

        System.out.printf("Area of this circle: %f, Area of this rectangle: %f", cirArea, rectArea);
    }
}
