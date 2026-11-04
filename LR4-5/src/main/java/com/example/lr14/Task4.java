package com.example.lr14;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "salinity.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.println("Введите 15 значений солёности воды:");
            for (int i = 0; i < 15; i++) {
                System.out.print("Значение " + (i + 1) + ": ");
                double value = scanner.nextDouble();
                writer.write(value + "\n");
            }
            System.out.println("Данные записаны в " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        double sum = 0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nЗначения солёности");
            while ((line = reader.readLine()) != null) {
                double value = Double.parseDouble(line.trim());
                System.out.println(value);
                sum += value;
                count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }

        if (count > 0) {
            double average = sum / count;
            System.out.printf("%nСредняя солёность: %.2f%n", average);
        } else {
            System.out.println("Нет данных для подсчёта");
        }

        scanner.close();
    }
}