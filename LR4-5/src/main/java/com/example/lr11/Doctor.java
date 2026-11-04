package com.example.lr11;

public class Doctor extends Professional {
    private String specialization;

    public Doctor(String name, int experience, double salary, String specialization) {
        super(name, experience, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getResponsibility() {
        return "Здоровье пациентов";
    }

    public void work(int hours, String diagnosis) {
        System.out.println("Лечу " + diagnosis + " уже " + hours + " часов");
    }
}