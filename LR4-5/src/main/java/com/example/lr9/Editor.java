package com.example.lr9;

public class Editor extends Software {
    private String format;

    public Editor(String name, String version, double price, String format) {
        super(name, version, price);
        this.format = format;
    }

    public String getFormat() { return format; }
    public void setFormat(String format) { this.format = format; }

    public void install() {
        System.out.println("Установка редактора занимает 5 ГБ");
    }

    public String getRequirements() {
        return "Требуется Windows 7, 4 ГБ RAM";
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Формат: " + format);
    }
}