package org.example;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("Площадь круга: " + area);
        System.out.println("Периметр круга: " + circumference);
    }
}
