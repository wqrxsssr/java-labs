package com.example.lr12.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void printPlayers(List<FootballPlayer> players, int rating) {
        System.out.println(" Игроки с рейтингом выше заданного " + rating + " ");
        Iterator<FootballPlayer> it = players.iterator();
        while (it.hasNext()) {
            FootballPlayer p = it.next();
            if (p.getAverageMatchRating() > rating) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        List<FootballPlayer> players = new ArrayList<>();

        players.add(new FootballPlayer(1, "Месси", "Нападающий", 5,
                new ArrayList<>(List.of(5, 4, 5, 5, 4))));
        players.add(new FootballPlayer(2, "Роналду", "Нападающий", 5,
                new ArrayList<>(List.of(5, 5, 4, 4, 5))));
        players.add(new FootballPlayer(3, "Неймар", "Нападающий", 4,
                new ArrayList<>(List.of(3, 4, 3, 4, 3))));
        players.add(new FootballPlayer(4, "Модрич", "Полузащитник", 4,
                new ArrayList<>(List.of(4, 5, 4, 5, 4))));
        players.add(new FootballPlayer(5, "Рамос", "Защитник", 3,
                new ArrayList<>(List.of(3, 2, 3, 3, 2))));
        players.add(new FootballPlayer(6, "Нойер", "Вратарь", 5,
                new ArrayList<>(List.of(5, 5, 5, 4, 5))));
        players.add(new FootballPlayer(7, "Бензема", "Нападающий", 4,
                new ArrayList<>(List.of(4, 4, 4, 3, 4))));

        System.out.println(" Средний рейтинг > 3");
        Iterator<FootballPlayer> it1 = players.iterator();
        while (it1.hasNext()) {
            FootballPlayer p = it1.next();
            if (p.getAverageMatchRating() > 3) {
                System.out.println(p);
            }
        }

        System.out.println("\nПовышение рейтинга (средний >= 4)");
        Iterator<FootballPlayer> it2 = players.iterator();
        while (it2.hasNext()) {
            FootballPlayer p = it2.next();
            if (p.getAverageMatchRating() >= 4) {
                p.setRating(p.getRating() + 1);
                System.out.println(p.getName() + " - новый рейтинг: " + p.getRating());
            }
        }

        System.out.println();
        printPlayers(players, 3);

        System.out.println("\nСортировка");
        players.sort(new Comparator<FootballPlayer>() {
            @Override
            public int compare(FootballPlayer a, FootballPlayer b) {
                int cmp = Double.compare(b.getAverageMatchRating(),
                        a.getAverageMatchRating());
                if (cmp != 0) return cmp;
                return b.getName().compareTo(a.getName());
            }
        });

        Iterator<FootballPlayer> it3 = players.iterator();
        while (it3.hasNext()) {
            FootballPlayer p = it3.next();
            System.out.printf("ID: %d, имя: %s, средний рейтинг: %.2f%n",
                    p.getId(), p.getName(), p.getAverageMatchRating());
        }
    }
}