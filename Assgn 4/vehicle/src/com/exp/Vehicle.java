package com.exp;

public class Vehicle {
    
    public void drive() {
        System.out.println("Vehicle is driving.");
    }
    
  
    public void drive(int speed) {
        System.out.println("Vehicle is driving at speed: " + speed + " km/h");
    }
    
    
    public void drive(String driver, int speed) {
        System.out.println(driver + " is driving the vehicle at speed: " + speed + " km/h");
    }
    
    
    public void drive(String driver, int speed, String destination) {
        System.out.println(driver + " is driving the vehicle to " + destination + " at speed: " + speed + " km/h");
    }
    
   
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        
       
        vehicle.drive();
        vehicle.drive(60);
        vehicle.drive("poonam", 80);
        vehicle.drive("priya", 100, "Airport");
    }
}
