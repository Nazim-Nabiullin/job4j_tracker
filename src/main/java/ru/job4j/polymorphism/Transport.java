package ru.job4j.polymorphism;

public interface Transport {
    void drive();

    void passenger(int busPassenger);

    int fillUp(int amounOfFuel);
}
