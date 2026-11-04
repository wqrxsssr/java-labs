package com.example.lr10;

public class Main {
    public static void main(String[] args) {
        Edible[] foods = new Edible[5];

        foods[0] = new Pasta("Карбонара", 350, "Перец, соль");
        foods[1] = new Pasta("Болоньезе", 400, "Базилик, орегано");
        foods[2] = new Pasta("Фетучини", 380, "Пармезан, чеснок");

        foods[3] = new Salad("Цезарь", 250, "Майонез");
        foods[4] = new Salad("Греческий", 180, "Оливковое масло");

        for (int i = 0; i < foods.length; i++) {
            System.out.println("Блюдо " + (i + 1) + " ");
            foods[i].eat();
            System.out.println("Калории: " + foods[i].getCalories());
        }
    }
}