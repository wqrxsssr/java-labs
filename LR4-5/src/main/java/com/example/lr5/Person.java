package com.example.lr5;

import java.time.Year;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }
    public String toString() {
        return firstName+" - "+lastName+" - "+birthYear;
    }

    public static void main(String[] args) {
        Person p = new Person("Анастасия", "Сигаёва", 2008);
        System.out.println("Возраст: " + p.getAge());
        System.out.println(p);
    }
}