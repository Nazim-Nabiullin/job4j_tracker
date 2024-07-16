package ru.job4j.example;

import java.util.Scanner;

public class ExampleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r = input.nextDouble();
        String perimetr = String.format("%.1f", 4 * a);
        System.out.println(perimetr);
        String area = String.format("%.1f", 2 * Math.PI * r);
        System.out.println(area);
        String square = String.format("%.1f", Math.PI * Math.pow(r, 2));
        System.out.println(square);
    }
}