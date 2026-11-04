package com.example.lr8;

public class Tree extends Plant {
    private double crownDiameter;

    public Tree(String name, double height, String type, double crownDiameter) {
        super(name, height, type);
        this.crownDiameter = crownDiameter;
    }

    public double getCrownDiameter() { return crownDiameter; }
    public void setCrownDiameter(double crownDiameter) {
        this.crownDiameter = crownDiameter;
    }

    public void grow() {
        System.out.println("Растет медленно");
    }

    public void cutDown() {
        System.out.println(getName() + " срублено");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Диаметр кроны: " + crownDiameter + " м");
    }
}