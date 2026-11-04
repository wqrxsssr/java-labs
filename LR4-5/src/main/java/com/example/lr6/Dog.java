package com.example.lr6;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void bark() {
        System.out.println("Гав!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Барсик", "Лабрадор", 3);

        System.out.println("Имя: " + dog.getName());
        System.out.println("Порода: " + dog.getBreed());
        System.out.println("Возраст: " + dog.getAge());

        dog.bark();
    }
}