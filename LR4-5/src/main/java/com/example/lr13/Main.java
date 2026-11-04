package com.example.lr13;

public class Main {
    public static void main(String[] args) {

        MagazineCatalog catalog = new MagazineCatalog();

        // ===== 1. Создание журналов =====
        System.out.println("=== Создание журналов ===");
        try {
            Magazine m1 = new Magazine("Наука и жизнь", "Правда", 12, 100, 250.0);
            Magazine m2 = new Magazine("Вокруг света", "Ридерз Дайджест", 5, 80, 180.0);
            Magazine m3 = new Magazine("Мурзилка", "Детгиз", 3, 40, 90.0);

            catalog.addMagazine(m1);
            catalog.addMagazine(m2);
            catalog.addMagazine(m3);

            System.out.println("Создано журналов: " + catalog.getMagazines().size());

        } catch (InvalidMagazineDataException e) {
            System.out.println("Ошибка при создании журнала: " + e.getMessage());
        }

        // ===== 2. Попытка создать журнал с неверными данными =====
        System.out.println("\n=== Проверка некорректных данных ===");
        try {
            Magazine bad = new Magazine("Пустой", "Издатель", -1, 50, 100.0);
            // ↑ отрицательный номер выпуска → исключение
        } catch (InvalidMagazineDataException e) {
            System.err.println("Поймали: " + e.getMessage());
        }

        try {
            Magazine bad2 = new Magazine("Пустой", "Издатель", 5, 0, 100.0);
            // ↑ страниц 0 → исключение
        } catch (InvalidMagazineDataException e) {
            System.out.println("Поймали: " + e.getMessage());
        }

        // ===== 3. Подписка =====
        System.out.println("\n=== Подписка ===");
        try {
            Magazine m = catalog.findMagazine("Наука и жизнь");
            m.subscribe("Иван");
            m.subscribe("Петр");
            m.subscribe("Мария");

            System.out.println("Подписчики: " + m.getSubscribers());

        } catch (MagazineNotFoundException e) {
            System.out.println("Журнал не найден: " + e.getMessage());
        } catch (SubscriptionException e) {
            System.out.println("Ошибка подписки: " + e.getMessage());
        }

        // ===== 4. Повторная подписка (ошибка) =====
        System.out.println("\n=== Повторная подписка ===");
        try {
            Magazine m = catalog.findMagazine("Наука и жизнь");
            m.subscribe("Иван");   // ← Иван уже подписан
        } catch (MagazineNotFoundException e) {
            System.out.println("Журнал не найден: " + e.getMessage());
        } catch (SubscriptionException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // ===== 5. Отписка =====
        System.out.println("\n=== Отписка ===");
        try {
            Magazine m = catalog.findMagazine("Наука и жизнь");
            m.unsubscribe("Петр");
            System.out.println("Подписчики после отписки: " + m.getSubscribers());
        } catch (MagazineNotFoundException e) {
            System.out.println("Журнал не найден: " + e.getMessage());
        } catch (SubscriptionException e) {
            System.out.println("Ошибка отписки: " + e.getMessage());
        }

        // ===== 6. Отписка несуществующего подписчика =====
        System.out.println("\n=== Отписка несуществующего ===");
        try {
            Magazine m = catalog.findMagazine("Наука и жизнь");
            m.unsubscribe("Николай");   // ← его нет в списке
        } catch (MagazineNotFoundException e) {
            System.out.println("Журнал не найден: " + e.getMessage());
        } catch (SubscriptionException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // ===== 7. Поиск несуществующего журнала =====
        System.out.println("\n=== Поиск несуществующего журнала ===");
        try {
            Magazine m = catalog.findMagazine("Какие-то новости");
        } catch (MagazineNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}