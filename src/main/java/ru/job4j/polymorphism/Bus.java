package ru.job4j.polymorphism;

public class Bus implements Transport {
      private int priceOfLitr = 55;

    @Override
    public void move() {
        System.out.println("Автобус доехал до места назначения");
    }

    @Override
    public void passenger(int busPassenger) {
        System.out.println("В салоне атобуса " + busPassenger + " пассажиров");
    }

    @Override
    public int refuel(int fuel) {
        return fuel * priceOfLitr;
    }
}
