package ru.job4j.cast;

public class Airplain implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает по воздуху");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " ускоряется за счет мощности турбин");
    }
}
