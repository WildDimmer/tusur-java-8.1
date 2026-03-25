package org.example;

import java.util.Random;

public class MaxNumber {

    private final int arrayLength;
    private final int[] numbers;

    public MaxNumber(int length) {
        if (length <= 0) throw new IllegalArgumentException("Размер массива должен быть положительным");
        this.arrayLength = length;
        this.numbers = new int[length];
        generateRandomNumbers();
    }

    private void generateRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = random.nextInt(1001);
        }
    }

    public int findMaxNumber() {
        if (numbers.length == 0) throw new IllegalStateException("Массив пуст");

        int max = numbers[0];
        for (int i = 1; i < arrayLength; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public String toString() {
        return "Максимальное число в массиве из " + arrayLength + " чисел = " + findMaxNumber();
    }
}
