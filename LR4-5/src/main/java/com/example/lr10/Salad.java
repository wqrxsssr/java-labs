package com.example.lr10;

public class Salad implements Edible, Spiceable {
    private String name;
    private int calories;
    private String dressing;

    public Salad(String name, int calories, String dressing) {
        this.name = name;
        this.calories = calories;
        this.dressing = dressing;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void setCalories(int calories) { this.calories = calories; }
    public void setDressing(String dressing) { this.dressing = dressing; }

    public void eat() {
        System.out.println("Едим салат " + name);
    }

    public int getCalories() {
        return calories;
    }

    public void addSpice() {
        System.out.println("Полили соусом: " + dressing);
    }

    public String getSpices() {
        return dressing;
    }
}