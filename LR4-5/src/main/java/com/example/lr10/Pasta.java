package com.example.lr10;

public class Pasta implements Edible, Spiceable {
    private String name;
    private int calories;
    private String spices;

    public Pasta(String name, int calories, String spices) {
        this.name = name;
        this.calories = calories;
        this.spices = spices;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void setCalories(int calories) { this.calories = calories; }
    public void setSpices(String spices) { this.spices = spices; }

    public void eat() {
        System.out.println("Едим пасту " + name);
    }

    public int getCalories() {
        return calories;
    }

    public void addSpice() {
        System.out.println("Добавили приправу: " + spices);
    }

    public String getSpices() {
        return spices;
    }
}