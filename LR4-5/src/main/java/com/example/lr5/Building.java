package com.example.lr5;

public class Building {
    private String address;
    private int floors;
    private double totalArea;

    public Building(String address, int floors, double totalArea) {
        this.address = address;
        this.floors = floors;
        this.totalArea = totalArea;
    }

    public int getFloors() { return floors; }
    public double getTotalArea() { return totalArea; }
    public String getAddress() { return address; }

    public static void main(String[] args) {
        Building[] buildings = {
                new Building("ул. Ленина, 1", 5, 1200.5),
                new Building("пр. Мира, 15", 12, 8000.0),
                new Building("ул. Гагарина, 8", 3, 450.0),
                new Building("ул. Пушкина, 22", 9, 3500.75),
                new Building("пр. Победы, 3", 7, 2100.0),
                new Building("ул. Садовая, 10", 15, 12000.0)
        };

        Building maxFloors = buildings[0];
        for (int i = 1; i < buildings.length; i++) {
            if (buildings[i].getFloors() > maxFloors.getFloors()) {
                maxFloors = buildings[i];
            }
        }

        Building maxArea = buildings[0];
        for (int i = 1; i < buildings.length; i++) {
            if (buildings[i].getTotalArea() > maxArea.getTotalArea()) {
                maxArea = buildings[i];
            }
        }

        System.out.println("Макс. этажей: " + maxFloors.getFloors()
                + " - " + maxFloors.getAddress());
        System.out.println("Макс. площадь: " + maxArea.getTotalArea()
                + " - " + maxArea.getAddress());
    }
}