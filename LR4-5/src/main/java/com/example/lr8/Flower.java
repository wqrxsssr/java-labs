package com.example.lr8;

public class Flower extends Plant {
    private String bloomColor;

    public Flower(String name, double height, String type, String bloomColor) {
        super(name, height, type);
        this.bloomColor = bloomColor;
    }

    public String getBloomColor() { return bloomColor; }
    public void setBloomColor(String bloomColor) {
        this.bloomColor = bloomColor;
    }

    public void grow() {
        System.out.println("Растет быстро");
    }
    public void bloom() {
        System.out.println(getName() + " цветет (" + bloomColor + ")");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Цвет цветения: " + bloomColor);
    }
}