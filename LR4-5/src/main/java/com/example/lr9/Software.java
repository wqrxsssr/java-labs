package com.example.lr9;

public abstract class Software {
    private String name;
    private String version;
    private double price;

    public Software(String name, String version, double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String getName() { return name; }
    public String getVersion() { return version; }
    public double getPrice() { return price; }

    public void setName(String name) { this.name = name; }
    public void setVersion(String version) { this.version = version; }
    public void setPrice(double price) { this.price = price; }

    public abstract void install();
    public abstract String getRequirements();

    public void displayInfo() {
        System.out.println("Название: " + name + ", версия: " + version + ", цена: " + price + " руб.");
    }
}