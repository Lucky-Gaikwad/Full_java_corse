package com.example.PackagesChallanges3;

import javax.sound.midi.Soundbank;

public class testEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Lucky Gaikwad", 19, 25000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Lucky");
        System.out.println(emp.getEmployeeDetails());
    }
}
