package org.example;

import java.util.Arrays;
import java.util.Random;

public class MatrixSorting {
    private final int array1Length;
    private final int array2Length;
    private final int[][] matrix;

    public MatrixSorting(int size1, int size2) {
        if (size1 <= 0 || size2 <= 0)
            throw new IllegalArgumentException("Размер массива должен быть положительным");

        this.array1Length = size1;
        this.array2Length = size2;
        this.matrix = new int[size1][size2];
        generateRandomMatrix();
        sortMatrix();
    }

    private void generateRandomMatrix() {
        Random random = new Random();
        for (int i = 0; i < array1Length; i++) {
            for (int j = 0; j < array2Length; j++) {
                matrix[i][j] = random.nextInt(1000);
            }
        }
    }

    public void sortMatrix() {
        for (int i = 0; i < array1Length; i++) {
            Arrays.sort(matrix[i]);
        }
    }

    public String getDiagonalElementsString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Диагональные элементы после сортировки:\n");

        for (int i = 0; i < matrix.length; i++) {
            sb.append(String.format("Строка %d, столбец %d: %d%n", (i+1), (i+1), matrix[i][i]));
        }

        return sb.toString();
    }
}
