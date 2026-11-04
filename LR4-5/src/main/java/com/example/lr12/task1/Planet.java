package com.example.lr12.task1;

public class Planet {
    private String name;
    private int id;
    private double mass;

    public Planet(String name, int id, double mass) {
        this.name = name;
        this.id = id;
        this.mass = mass;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getMass() { return mass; }

    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }
    public void setMass(double mass) { this.mass = mass; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" + name + "', id=" + id + ", mass=" + mass + "}";
    }
}