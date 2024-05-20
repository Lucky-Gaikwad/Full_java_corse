package com.example.PackagesChallanges3;

class Employee {
    private String Name;
    private int age;
    private double salary;

     Employee(String name, int age, double salary) {
        Name = name;
        this.age = age;
        this.salary = salary;
    }

    String getEmployeeDetails () {
         return "EmployeeDetails: Name: " + Name + ", Age: " + age + ", Salary: " + salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
