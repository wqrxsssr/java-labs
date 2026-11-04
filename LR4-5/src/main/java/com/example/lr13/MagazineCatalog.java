package com.example.lr13;

import java.util.ArrayList;
import java.util.List;

public class MagazineCatalog {
    private List<Magazine> magazines = new ArrayList<>();

    public void addMagazine(Magazine m) {
        magazines.add(m);
    }

    public Magazine findMagazine(String title) throws MagazineNotFoundException {
        for (Magazine m : magazines) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                return m;
            }
        }
        throw new MagazineNotFoundException(
                "Журнал с названием \"" + title + "\" не найден");
    }

    public List<Magazine> getMagazines() {
        return magazines;
    }
}