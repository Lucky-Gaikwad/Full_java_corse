package com.example.StreamChallange1;

import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List <Employee> employees = List.of(
            new Employee("Lucky", 10000),
            new Employee("Ashish", 20000),
            new Employee("Anuk", 30000), 
            new Employee("Nikki", 40000),
            new Employee("Sony", 50000)       
        );
        employees.stream()
        //.sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary())) 
        //it's also right but we use another way
        .sorted((emp1,emp2) -> emp1.getSalary() - emp2.getSalary())
        .forEach(System.out::println);
                
    }

}
