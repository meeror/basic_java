package org.example;
import java.util.Scanner;
import java.util.Random;

public class MatrixOperations {
    // Максимальний розмір матриці
    private static final int maxSize = 20;
    // Діапазон рандомних чисел
    private static final int randomMin = 1;
    private static final int randomMax = 100;

    private int[][] matrix;
    private int width;
    private int height;



    public void run() {
        readMatrixSize();
        initializeMatrix();
        printMatrix();
        findMinMax();
        calculateArithmeticAverage();
        calculateGeometricAverage();
    }

    public void readMatrixSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ширину матриці (не більше " + maxSize + "):");
        width = scanner.nextInt();
        System.out.println("Введіть висоту матриці (не більше " + maxSize + "):");
        height = scanner.nextInt();
        // Перевірка на максимальний розмір
        if (width > maxSize || height > maxSize) {
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
                    matrix[i][j] = random.nextInt(randomMax - randomMin + 1) + randomMin;
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

    public void calculateArithmeticAverage() {
        double sum = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sum += matrix[i][j];
            }
        }
        double average = sum / (width * height);
        System.out.println("Середнє арифметичне: " + average);
    }

    public void calculateGeometricAverage() {
        double product = 1.0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                product *= matrix[i][j];
            }
        }
        double geometricMean = Math.pow(product, 1.0 / (width * height));
        System.out.println("Середнє геометричне: " + geometricMean);
    }
}
