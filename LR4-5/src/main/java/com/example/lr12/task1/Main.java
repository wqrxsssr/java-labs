package com.example.lr12.task1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Planet> planets = new HashMap<>();

        planets.put("Земля",  new Terrestrial("Земля", 3, 5.97, "N2, O2"));
        planets.put("Марс",   new Terrestrial("Марс", 4, 0.64, "CO2"));
        planets.put("Венера", new Terrestrial("Венера", 2, 4.87, "CO2, N2"));

        planets.put("Юпитер", new GasGiant("Юпитер", 5, 1898.0, true));
        planets.put("Сатурн", new GasGiant("Сатурн", 6, 568.0, true));
        planets.put("Уран",   new GasGiant("Уран", 7, 86.8, true));

        planets.put("Плутон", new Dwarf("Плутон", 9, 0.013, 5));
        planets.put("Церера", new Dwarf("Церера", 10, 0.00094, 0));

        System.out.println("Ключи:");
        Iterator<String> keyIterator = planets.keySet().iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            System.out.println(key);
        }

        System.out.println("\nЗначения:");
        Iterator<Planet> valueIterator = planets.values().iterator();
        while (valueIterator.hasNext()) {
            Planet p = valueIterator.next();
            System.out.println(p);
        }

        System.out.println("\n Ключ - Значение:");
        Iterator<Map.Entry<String, Planet>> entryIterator =
                planets.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Planet> entry = entryIterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}