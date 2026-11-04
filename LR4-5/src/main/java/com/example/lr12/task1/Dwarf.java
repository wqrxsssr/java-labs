package com.example.lr12.task1;

public class Dwarf extends Planet {
    private int moons;

    public Dwarf(String name, int id, double mass, int moons) {
        super(name, id, mass);
        this.moons = moons;
    }

    public int getMoons() { return moons; }
    public void setMoons(int moons) { this.moons = moons; }

    @Override
    public String toString() {
        return super.toString() + ", moons=" + moons;
    }
}