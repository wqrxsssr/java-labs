package com.example.lr11;

public class Main {
    public static void main(String[] args) {
        Professional p = new Professional("Иван", 5, 1000);

        p.work();
        p.work(8);
        p.work("Разработка сайта");

        Doctor doc = new Doctor("Петр", 10, 2000, "Хирург");
        doc.work(6, "простуду");

        Engineer eng = new Engineer("Сергей", 7, 1800, "Строительство");
        eng.work("мост", 30);

        System.out.println();

        Professional[] professionals = {
                new Professional("Иван", 5, 1000),
                new Doctor("Петр", 10, 2000, "Хирург"),
                new Engineer("Сергей", 7, 1800, "Строительство"),
                new Doctor("Анна", 3, 1500, "Терапевт"),
                new Engineer("Ольга", 12, 2500, "Программирование")
        };

        for (int i = 0; i < professionals.length; i++) {
            System.out.println(professionals[i].getName() + " = " + professionals[i].getResponsibility());
        }

        System.out.println();

    }
}