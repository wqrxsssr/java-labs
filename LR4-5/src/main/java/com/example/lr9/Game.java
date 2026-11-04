package com.example.lr9;

public class Game extends Software {
    private String genre;

    public Game(String name, String version, double price, String genre) {
        super(name, version, price);
        this.genre = genre;
    }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public void install() {
        System.out.println("Установка игры занимает 50 ГБ");
    }

    public String getRequirements() {
        return "Требуется Windows 10, 16 ГБ RAM";
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Жанр: " + genre);
    }
}