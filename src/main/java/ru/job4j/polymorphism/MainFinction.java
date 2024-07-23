package ru.job4j.polymorphism;

public class MainFinction implements FunctionOne, FunctionTwo {
    @Override
    public double function(double x, double y) {
        return FunctionTwo.super.function(x, y);
    }
}
