package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int multiply(int z) {
        return x * z;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int c) {
        return sum(c) + multiply(c) + minus(c) + divide(c);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(multiply(5));
        System.out.println(minus(6));
        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(25));
        System.out.println(calculator.sumAllOperation(1));
    }
}
