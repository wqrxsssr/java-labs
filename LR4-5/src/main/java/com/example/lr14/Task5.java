package com.example.lr14;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        String fileName = "a.txt";
        Random random = new Random();

        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < 10; i++) {
                writer.write((random.nextInt(100) + 1) + "\n");
            }
            System.out.println("Файл a.txt создан: 10 случайных чисел (1–100)");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        int countMultiplesOf6 = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nЧисла из файла");
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                System.out.println(number);
                if (number % 6 == 0) {
                    countMultiplesOf6++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }

        System.out.println("\nКоличество чисел, кратных 6: " + countMultiplesOf6);
    }
}