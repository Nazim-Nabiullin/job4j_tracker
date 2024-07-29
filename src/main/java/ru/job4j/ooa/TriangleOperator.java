package ru.job4j.ooa;

import java.util.Scanner;

public class TriangleOperator extends ShapeOperator {
    private Scanner input = new Scanner(System.in);

    @Override
    public Shape createShape() {
        System.out.println("Введите длину основания треугольника: ");
        int a = Integer.parseInt((input.nextLine()));
        System.out.println("Введите высоту треугольника: ");
        int b = Integer.parseInt((input.nextLine()));
        return new Rectangle(a, b);
    }
}
