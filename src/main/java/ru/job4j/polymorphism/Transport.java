package ru.job4j.polymorphism;

public interface Transport {
    void move();

    void passenger(int busPassenger);

    int refuel(int fuel);
}
