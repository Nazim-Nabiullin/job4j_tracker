package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public void passenger(int count) {

    }

    @Override
    public int fillUp(int amounOfFuel) {
        return 0;
    }
}
