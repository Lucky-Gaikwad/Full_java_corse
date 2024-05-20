package com.example.AbstractionChallanges1;

public class TestShapes {
    public static void main(String[] args) {
        //Shape shape = new Shape();
        Circle cir = new Circle(5);
        Square squ = new Square(4);
        System.out.printf("Area fo circle is %5.2f\n", cir.calculateArea());
        System.out.printf("Area of square is %5.2f", squ.calculateArea());
    }
}
