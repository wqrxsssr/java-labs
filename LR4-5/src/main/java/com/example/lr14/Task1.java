package com.example.lr14;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("favorite_color.txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Мой любимый цвет — синий.\n");
            writer.write("Он символизирует спокойствие и глубину.\n");
            writer.write("Синий — цвет неба и моря.\n");
            System.out.println("Файл создан и записан: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        System.out.println("\nИнформация о файле");
        System.out.println("Имя:" + file.getName());
        System.out.println("Размер:" + file.length() + " байт");
        System.out.println("Путь:" + file.getPath());
        System.out.println("Абсолютный путь:" + file.getAbsolutePath());
        System.out.println("Родительский каталог:" + file.getParent());
        System.out.println("Существует:" + file.exists());
        System.out.println("Можно читать:" + file.canRead());
        System.out.println("Можно писать:" + file.canWrite());
        System.out.println("Это файл:" + file.isFile());
        System.out.println("Последнее изменение:" + file.lastModified());
        
        System.out.println("\nСодержимое файла");
        try (FileReader reader = new FileReader(file)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}