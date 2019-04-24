package main.java.Factory;

import main.java.Factory.Car;

public class Volkswagen implements CarFactory {
    private Car car;

    public Volkswagen(String manufacturer, String carType, String trade) {
        this.car = new Car(manufacturer, carType, trade);
    }

    @Override
    public Car getCar() {
        return car;
    }

    
}