package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по рельсам");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " ускоряется за счет силы тяги локомотива");
    }
}
