package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1.
        System.out.print("Введите радиус круга, площадь которого хотите узнать: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);


        // Задача 2.
        System.out.print("Введите сумму в долларах: ");
        BigDecimal dollars = scanner.nextBigDecimal();
        BigDecimal euros = CurrencyConverter.convertToEuros(dollars);
        System.out.println(euros);

        // Задача 3.
        System.out.print("Введите размер массива: ");
        int length = scanner.nextInt();
        MaxNumber maxNumber = new MaxNumber(length);
        System.out.println(maxNumber.findMaxNumber());

        // Задача 4.
        MatrixSorting matrixSorting = new MatrixSorting(5, 5);
        System.out.println(matrixSorting.getDiagonalElementsString());

        // Задача 5.
        System.out.println("Введите строку, в которой необходимо убрать пробелы:");
        String fullString = scanner.nextLine();
        WhitespaceTrimming whitespaceTrimming = new WhitespaceTrimming();
        System.out.println(whitespaceTrimming.removeAllSpaces(fullString));


        // Задача 6.
        System.out.println("Введите свой возраст: ");
        int age = scanner.nextInt();
        AgeChecking ageChecking = new AgeChecking(age);
        System.out.println(ageChecking.ageChecker());

        scanner.close();
    }
}