package com.example.lr5;

public class Car {
    private String model;
    private FuelType fuelType;

    public Car(String model, FuelType fuelType) {
        this.model = model;
        this.fuelType = fuelType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public String toString() {
        return model + " - " + fuelType;
    }

    public static void main(String[] args) {
        Car[] cars = {
                new Car("Tesla Model 3", FuelType.ELECTRIC),
                new Car("Toyota Camry", FuelType.PETROL),
                new Car("BMW i4", FuelType.ELECTRIC),
                new Car("Audi Q7", FuelType.DIESEL),
                new Car("Toyota Prius", FuelType.HYBRID)
        };

        System.out.println("Электромобили:");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getFuelType() == FuelType.ELECTRIC) {
                System.out.println(cars[i]);
            }
        }
    }
}