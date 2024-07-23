package ru.job4j.polymorphism;

public interface Transport {
    void drive();

    void passenger(int count);

    int fillUp(int amounOfFuel);
}
