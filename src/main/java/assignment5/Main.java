package main.java.assignment5;

import main.java.Factory.Car;
import main.java.Factory.CarFactory;
import main.java.Factory.Volkswagen;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating car");
        Car car;

        System.out.println("Creating volkswagen factory");
        CarFactory volksFactory = null;

        System.out.println("Creating volkswagen car");
        volksFactory = new Volkswagen("Volkswagen", "Sport", "Futuristic");
        car = volksFactory.getCar();
        System.out.println(car);
        
    }

}