import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Ваш выбор");
        number = scanner.nextInt();

        switch (number) {
            case 1:
                // Проверка массива на строгое возрастание
                System.out.print("Введите размер массива");
                int n = scanner.nextInt();

                int[] arr = new int[n];
                System.out.println("Введите элементы массива");
                for (int i = 0; i < n; i++) {
//                    System.out.print("arr[" + i + "] = ");
//                    arr[i] = scanner.nextInt();
                    Random rand = new Random();
                    arr[i]= rand.nextInt(10);
                    System.out.print(arr[i]);
                }

                // Проверка на строгое возрастание
                boolean isGrowing = true;
                for (int i = 0; i < n - 1; i++) {
                    if (arr[i] >= arr[i + 1]) {
                        isGrowing = false;
                        break;
                    }
                }

                if (isGrowing) {
                    System.out.println("Массив является строго возрастающим");
                } else {
                    System.out.println("Массив не является строго возрастающим");
                }
                break;

            case 2:
                // Одномерный массив из диагональных элементов
                System.out.print("Введите размер квадратной матрицы");
                int size = scanner.nextInt();

                int[][] matrix = new int[size][size];
                System.out.println("Введите элементы матрицы");
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.print("matrix[" + i + "][" + j + "] = ");
                        matrix[i][j] = scanner.nextInt();
                    }
                }

                // Формирование одномерного массива из главной диагонали
                int[] diagonal = new int[size];
                for (int i = 0; i < size; i++) {
                    diagonal[i] = matrix[i][i];
                }

                System.out.print("Элементы главной диагонали");
                for (int i = 0; i < diagonal.length; i++) {
                    System.out.print(diagonal[i] + " ");
                }
                System.out.println();
                break;

            default:
                System.out.println("Ошибка! Выберите номер задания 1 или 2");
        }

        scanner.close();
    }
}
//"\\+375\\s?\\(?\\d{2}\\)?\\s?\\d{3}[-\\s]?\\d{2}[-\\s]?\\d{2}"