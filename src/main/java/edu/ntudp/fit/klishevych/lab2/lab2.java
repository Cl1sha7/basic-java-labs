package edu.ntudp.fit.klishevych.lab2;
import java.util.Scanner;
import java.util.Random;

public class lab2 {
    private static final int MAX_SIZE = 20;
    private static final int RANDOM_MIN = 1;
    private static final int RANDOM_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width, height;
        do {
            System.out.print("Введіть ширину матриці (не більше " + MAX_SIZE + "): ");
            width = scanner.nextInt();
            System.out.print("Введіть висоту матриці (не більше " + MAX_SIZE + "): ");
            height = scanner.nextInt();
        } while (width <= 0 || height <= 0 || width > MAX_SIZE || height > MAX_SIZE);

        int[][] matrix = createMatrix(width, height, scanner);
        if (matrix != null) {
            printMatrix(matrix);
            findMinMaxAverage(matrix);
            findGeometricMean(matrix);
        } else {
            System.out.println("Помилка: неможливо створити матрицю.");
        }

        scanner.close();
    }

    private static int[][] createMatrix(int width, int height, Scanner scanner) {
        System.out.print("Введіть (1) для ручного введення або (2) для рандомного заповнення: ");
        int choice = scanner.nextInt();

        int[][] matrix = new int[width][height];
        Random random = new Random();

        if (choice == 1) {
            System.out.println("Введіть елементи матриці:");
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
        } else if (choice == 2) {
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    matrix[i][j] = random.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN;
                }
            }
        } else {
            System.out.println("Неправильний вибір. Використано рандомне заповнення.");
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    matrix[i][j] = random.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN;
                }
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Матриця:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    private static void findMinMaxAverage(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
                if (value > max) {
                    max = value;
                }
                sum += value;
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Середнє арифметичне: " + average);
    }
    private static void findGeometricMean(int[][] matrix) {
        long product = 1;
        int count = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                product *= value;
                count++;
            }
        }

        double geometricMean = Math.pow(product, 1.0 / count);

        System.out.println("Середнє геометричне: " + geometricMean);
    }
}