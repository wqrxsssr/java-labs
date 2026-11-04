package com.example.lr7;

public class Airplane {
    private  String model;
    private  int capacity;
    private  double range;

    private static int totalPlanes = 0;
    private static int totalCapacity = 0;
    public Airplane(String model, int capacity, double range) {
        this.model = model;
        this.capacity = capacity;
        this.range = range;

        totalPlanes++;
        totalCapacity += capacity;
    }

    public String getModel() { return model; }
    public int getCapacity() { return capacity; }
    public double getRange() { return range; }

    public static int getTotalPlanes() { return totalPlanes; }
    public static int getTotalCapacity() { return totalCapacity; }


    public static double getAverageCapacity() {
        if (totalPlanes == 0) {
            return 0;
        }
        return (double) totalCapacity / totalPlanes;
    }

    public void printInfo() {
        System.out.println("Модель: " + model
                + ", Вместимость: " + capacity
                + ", Дальность: " + range + " км");
    }

    public static void main(String[] args) {
        Airplane a1 = new Airplane("Boeing 737", 180, 5600);
        Airplane a2 = new Airplane("Airbus A320", 200, 6100);
        Airplane a3 = new Airplane("Boeing 777", 320, 15800);

        a1.printInfo();
        a2.printInfo();
        a3.printInfo();

        System.out.println();

        System.out.println("Всего самолётов: " + Airplane.getTotalPlanes());
        System.out.println("Общая вместимость: " + Airplane.getTotalCapacity());
        System.out.println("Средняя вместимость: " + Airplane.getAverageCapacity());
    }
}