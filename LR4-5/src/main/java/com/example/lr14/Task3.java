package com.example.lr14;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        String fileF = "f.txt";
        String fileG = "g.txt";
        String fileH = "h.txt";

        Random random = new Random();

        try (FileWriter writer = new FileWriter(fileF)) {
            for (int i = 0; i < 20; i++) {
                writer.write(random.nextInt(100) + "\n");
            }
            System.out.println("Файл f создан: 20 случайных чисел (0–99)");
        } catch (IOException e) {
            System.out.println("Ошибка записи в f: " + e.getMessage());
            return;
        }

        try (
                BufferedReader reader = new BufferedReader(new FileReader(fileF));
                FileWriter writerG = new FileWriter(fileG);
                FileWriter writerH = new FileWriter(fileH)
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                if (number % 2 == 0 && number < 50) {
                    writerG.write(number + "\n");
                } else {
                    writerH.write(number + "\n");
                }
            }
            System.out.println("Разделение выполнено: чётные <50 → g.txt, остальные → h.txt");
        } catch (IOException e) {
            System.out.println("Ошибка обработки: " + e.getMessage());
        }

        System.out.println("\nf.txt");
        printFile(fileF);
        System.out.println("\ng.txt (чётные < 50)");
        printFile(fileG);
        System.out.println("\nh.txt (остальные)");
        printFile(fileH);
    }

    static void printFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.print(line + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}