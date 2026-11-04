package com.example.lr14;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "f.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                int number = scanner.nextInt();
                writer.write(number + "\n");
            }
            System.out.println("Числа записаны в файл " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }
        System.out.println("\nЧисла из файла");
        int countOddMultipleOf5 = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                System.out.println(number);

                // нечётное и кратное 5
                if (number % 2 != 0 && number % 5 == 0) {
                    countOddMultipleOf5++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }

        System.out.println("\nКоличество нечётных и кратных 5: " + countOddMultipleOf5);

        scanner.close();
    }
}