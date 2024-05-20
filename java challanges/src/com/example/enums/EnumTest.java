package com.example.enums;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week");
        for (Day value : Day.values()) {
            System.out.printf("%s : %s\n", value, value.getType());
        }
//        System.out.println(Day.MONDAY);
//        System.out.println(Day.TUESDAY);
//        System.out.println(Day.WEDNESDAY);
//        System.out.println(Day.THURSDAY);
//        System.out.println(Day.FRIDAY);
//        System.out.println(Day.SATURDAY);
//        System.out.println(Day.SUNDAY);
//        System.out.println();
//
//        for (Day value : Day.values()) {
//            System.out.println(value);
//        }
    }
}
