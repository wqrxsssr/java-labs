import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Ваш выбор");
        number = scanner.nextInt();
        scanner.nextLine();

        switch (number) {
            case 1:
                // Извлечь подстроку с 5-го символа до конца
                System.out.print("Введите строку");
                String str1 = scanner.nextLine();

                if (str1.length() >= 5) {
                    String sub = str1.substring(4);
                    System.out.println("Результат:" + sub);
                } else {
                    System.out.println("Строка слишком короткая");
                }
                break;

            case 2:
                // Найти самое короткое слово в предложении
                System.out.print("Введите предложение");
                String sentence = scanner.nextLine();

                String[] words = sentence.split(" ");
                String shortest = words[0];

                for (int i = 1; i < words.length; i++) {
                    if (words[i].length() < shortest.length()) {
                        shortest = words[i];
                    }
                }

                System.out.println("Самое короткое слово: " + shortest);
                break;

            case 3:
                // Отчёт по зарплате сотрудников
                Employee[] employees = {
                        new Employee("Иванов Иван", 1500.5),
                        new Employee("Петров Петр", 2200.75),
                        new Employee("Сидоров Сидор", 1800.0),
                        new Employee("Кузнецов Алексей", 3000.25)
                };

                Report.generateReport(employees);
                break;

            case 4:
                // Поиск строк вида 'aXa'
                String text = "aAa aBa aCa aDa aEa aFa aGa";

                String[] parts = text.split(" ");

                System.out.println("Исходная строка: " + text);
                System.out.println("Найденные строки:");

                for (int i = 0; i < parts.length; i++) {
                    if (parts[i].length() == 3
                            && parts[i].charAt(0) == 'a'
                            && parts[i].charAt(2) == 'a'
                            && parts[i].charAt(1) >= 'A'
                            && parts[i].charAt(1) <= 'Z'
                            && parts[i].charAt(1) != 'A'
                            && parts[i].charAt(1) != 'B'
                            && parts[i].charAt(1) != 'C') {
                        System.out.println(parts[i]);
                    }
                }
                break;

            default:
                System.out.println("Ошибка! Выберите номер задания 1, 2, 3 или 4");
        }

        scanner.close();
    }
}

class Employee {
    String fullname;
    double salary;

    Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}

class Report {
    static void generateReport(Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-15s | %15.2f%n", employees[i].fullname, employees[i].salary);
        }
    }
}
class Nastya{
    String name;
    int age;

    Nastya(String name, int age){
        this.name= name;
        this.age=age;
    }
}

