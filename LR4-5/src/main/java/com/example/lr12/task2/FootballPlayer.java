package com.example.lr12.task2;

import java.util.List;

public class FootballPlayer {
    private int id;
    private String name;
    private String position;
    private int rating;                 // 1–5
    private List<Integer> matchRatings;

    public FootballPlayer(int id, String name, String position,
                          int rating, List<Integer> matchRatings) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.rating = rating;
        this.matchRatings = matchRatings;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPosition() { return position; }
    public int getRating() { return rating; }
    public List<Integer> getMatchRatings() { return matchRatings; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPosition(String position) { this.position = position; }
    public void setRating(int rating) { this.rating = rating; }
    public void setMatchRatings(List<Integer> matchRatings) {
        this.matchRatings = matchRatings;
    }

    public double getAverageMatchRating() {
        if (matchRatings.isEmpty()) return 0;
        int sum = 0;
        for (int r : matchRatings) {
            sum += r;
        }
        return (double) sum / matchRatings.size();
    }

    @Override
    public String toString() {
        return "ID: " + id + ", имя: " + name + ", позиция: " + position + ", рейтинг: " + rating + ", средний по матчам: "
                + String.format("%.2f", getAverageMatchRating());
    }
}