package com.example.lr13;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private String title;
    private String publisher;
    private int issueNumber;
    private int pages;
    private double price;

    private List<String> subscribers = new ArrayList<>();

    public Magazine(String title, String publisher, int issueNumber,
                    int pages, double price) throws InvalidMagazineDataException {
        if (title == null || title.isEmpty()) {
            throw new InvalidMagazineDataException("Название не может быть пустым");
        }
        if (publisher == null || publisher.isEmpty()) {
            throw new InvalidMagazineDataException("Издатель не может быть пустым");
        }
        if (issueNumber <= 0) {
            throw new InvalidMagazineDataException(
                    "Номер выпуска должен быть > 0, получено: " + issueNumber);
        }
        if (pages <= 0) {
            throw new InvalidMagazineDataException(
                    "Количество страниц должно быть > 0, получено: " + pages);
        }
        if (price < 0) {
            throw new InvalidMagazineDataException(
                    "Цена не может быть отрицательной");
        }

        this.title = title;
        this.publisher = publisher;
        this.issueNumber = issueNumber;
        this.pages = pages;
        this.price = price;
    }

    public String getTitle() { return title; }
    public String getPublisher() { return publisher; }
    public int getIssueNumber() { return issueNumber; }
    public int getPages() { return pages; }
    public double getPrice() { return price; }
    public List<String> getSubscribers() { return subscribers; }

    public void subscribe(String subscriber) throws SubscriptionException {
        if (subscriber == null || subscriber.isEmpty()) {
            throw new SubscriptionException("Имя подписчика не может быть пустым");
        }
        if (subscribers.contains(subscriber)) {
            throw new SubscriptionException(
                    "Подписчик " + subscriber + " уже подписан");
        }
        subscribers.add(subscriber);
        System.out.println(subscriber + " успешно подписан на журнал " + title);
    }

    public void unsubscribe(String subscriber) throws SubscriptionException {
        if (!subscribers.contains(subscriber)) {
            throw new SubscriptionException(
                    "Подписчик " + subscriber + " не найден");
        }
        subscribers.remove(subscriber);
        System.out.println(subscriber + " отписан от журнала " + title);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' + ", publisher='" + publisher + '\'' + ", issueNumber=" + issueNumber + ", pages=" + pages + ", price=" + price + ", subscribers=" + subscribers + '}';
    }
}