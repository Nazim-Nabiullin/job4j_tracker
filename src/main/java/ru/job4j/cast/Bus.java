package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " двигается по скоростным трассам");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " ускоряется за счет моного дизельного двигателя");
    }
}
