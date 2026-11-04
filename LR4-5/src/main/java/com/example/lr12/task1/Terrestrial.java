package com.example.lr12.task1;

public class Terrestrial extends Planet {
    private String atmosphere;

    public Terrestrial(String name, int id, double mass, String atmosphere) {
        super(name, id, mass);
        this.atmosphere = atmosphere;
    }

    public String getAtmosphere() { return atmosphere; }
    public void setAtmosphere(String atmosphere) { this.atmosphere = atmosphere; }

    @Override
    public String toString() {
        return super.toString() + ", atmosphere='" + atmosphere + "'";
    }
}