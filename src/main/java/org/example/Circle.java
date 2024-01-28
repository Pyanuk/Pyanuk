package org.example;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус: ");
        double radius = scanner.nextDouble();

        System.out.println("Введите периметр: ");
        double perimetr = scanner.nextDouble();

        System.out.println("Введите площадь: ");
        double ploschad = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        double radiys = ploschad / 2 * Math.PI;

        System.out.println("Площадь: " + area);
        System.out.println("Периметр: " + circumference);
        System.out.println("Радиус: " + radiys);
    }
}
