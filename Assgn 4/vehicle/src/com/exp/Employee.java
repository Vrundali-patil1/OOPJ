package com.exp;

public class Employee {
    
    public void printInfo(int employeeId) {
        System.out.println("Employee ID: " + employeeId);
    }

 
    public void printInfo(double salary) {
        System.out.println("Salary: " + salary);
    }

   
    public void printInfo(String employeeName) {
        System.out.println("Employee Name: " + employeeName);
    }

   
    public void printInfo(int employeeId, String employeeName) {
        System.out.println("Employee ID: " + employeeId + ", Employee Name: " + employeeName);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

       
        emp.printInfo(101); 
        emp.printInfo(50000.0); 
        emp.printInfo("suresh"); 
        emp.printInfo(102, "naresh"); 
    }
}
