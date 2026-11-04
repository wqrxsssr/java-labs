package com.example.lr11;

public class Professional {
    private String name;
    private int experience;
    private double salary;

    public Professional(String name, int experience, double salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getExperience() { return experience; }
    public void setExperience(int experience) { this.experience = experience; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public void work() {
        System.out.println("Работаю");
    }

    public void work(int hours) {
        System.out.println("Работаю " + hours + " часов");
    }

    public void work(String project) {
        System.out.println("Работаю над проектом " + project);
    }

    public String getResponsibility() {
        return "Общая ответственность";
    }
}