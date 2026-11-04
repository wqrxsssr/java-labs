package com.example.lr12.task1;

public class GasGiant extends Planet {
    private boolean rings;

    public GasGiant(String name, int id, double mass, boolean rings) {
        super(name, id, mass);
        this.rings = rings;
    }

    public boolean hasRings() { return rings; }
    public void setRings(boolean rings) { this.rings = rings; }

    @Override
    public String toString() {
        return super.toString() + ", rings=" + rings;
    }
}