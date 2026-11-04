package com.example.lr8;

public class Plant {
    private String name;
    private double height;
    private String type;

    public Plant(String name, double height, String type) {
        this.name = name;
        this.height = height;
        this.type = type;
    }

    public String getName() { return name; }
    public double getHeight() { return height; }
    public String getType() { return type; }

    public void setName(String name) { this.name = name; }
    public void setHeight(double height) { this.height = height; }
    public void setType(String type) { this.type = type; }

    public void grow() {
        System.out.println(name + " растет");
    }

    public void displayInfo() {
        System.out.println("Название: " + name + ", высота: " + height + " м" + ", тип: " + type);
    }

    public static void main(String[] args) {
        Plant[] plants = new Plant[5];

        plants[0] = new Tree("Дуб", 15.0, "Лиственное", 8.5);
        plants[1] = new Tree("Сосна", 20.0, "Хвойное", 6.0);
        plants[2] = new Tree("Береза", 10.0, "Лиственное", 4.5);

        plants[3] = new Flower("Роза", 0.5, "Кустарник", "Красный");
        plants[4] = new Flower("Тюльпан", 0.3, "Травянистое", "Желтый");

        for (int i = 0; i < plants.length; i++) {
            System.out.println("Растение " + (i + 1));
            plants[i].displayInfo();
            plants[i].grow();
            System.out.println();
        }
        Plant plant = new Tree("Дуб", 15.0, "Лиственное", 8.5);
        Tree tree = new Tree("Дуб", 15.0, "Лиственное", 8.5);
    }
}