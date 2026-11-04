package com.example.lr9;

public class Main {
    public static void main(String[] args) {
        Software[] softwares = new Software[5];

        softwares[0] = new Game("Minecraft", "1.20", 2500, "Песочница");
        softwares[1] = new Game("Cyberpunk 2077", "2.0", 6000, "RPG");
        softwares[2] = new Game("FIFA 24", "1.0", 7000, "Спорт");

        softwares[3] = new Editor("Notepad++", "8.5", 0, "TXT");
        softwares[4] = new Editor("Photoshop", "2024", 15000, "PSD");

        for (int i = 0; i < softwares.length; i++) {
            System.out.println("ПО " + (i + 1) + " ");
            softwares[i].displayInfo();
            softwares[i].install();
            System.out.println(softwares[i].getRequirements());
            System.out.println();
        }
    }
}