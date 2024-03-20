package org.example;
import java.util.Scanner;
import java.util.Random;

public class MatrixOperations {
    // Максимальний розмір матриці
    private static final int MAX_SIZE = 20;
    // Діапазон рандомних чисел
    private static final int RANDOM_MIN = 1;
    private static final int RANDOM_MAX = 100;

    private int[][] matrix;
    private int width;
    private int height;



    public void run() {
        readMatrixSize();
        initializeMatrix();
        printMatrix();
        findMinMax();
        calculateAverage();
    }

    public void readMatrixSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ширину матриці (не більше " + MAX_SIZE + "):");
        width = scanner.nextInt();
        System.out.println("Введіть висоту матриці (не більше " + MAX_SIZE + "):");
        height = scanner.nextInt();
        // Перевірка на максимальний розмір
        if (width > MAX_SIZE || height > MAX_SIZE) {
            System.out.println("Розмір матриці перевищує максимально допустимий розмір.");
            System.exit(1);
        }
    }

    public void initializeMatrix() {
        matrix = new int[height][width];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Бажаєте ввести матрицю вручну? (Y/N)");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Введіть елементи матриці:");
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
        } else {
            // Генерування рандомних чисел для матриці
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = random.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN;
                }
            }
        }
    }

    public void printMatrix() {
        System.out.println("Матриця:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void findMinMax() {
        int min = matrix[0][0];
        int max = matrix[0][0];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
    }

    public void calculateAverage() {
        double sum = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sum += matrix[i][j];
            }
        }
        double average = sum / (width * height);
        System.out.println("Середнє арифметичне: " + average);
    }
}
