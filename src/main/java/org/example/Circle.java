package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Circle {

    private double radius;
    private static final double PI = Math.PI;

    public double getArea() {

        double circleArea = PI * radius * radius;
        double roundedCircleArea = Math.round(circleArea * 1e5) / 1e5; // округление до 5 знаков после запятой
        return  roundedCircleArea;
}

    @Override
    public String toString() {
        return "Круг с радиусом: " + radius + " см. " + "будет иметь площадь " + getArea() + " см.";
    }
}
