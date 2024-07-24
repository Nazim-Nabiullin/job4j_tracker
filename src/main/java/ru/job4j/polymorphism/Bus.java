package ru.job4j.polymorphism;

public class Bus implements Transport {

    private int amountOfTime = 2;
    private int speedBus = 80;

    private int price = 10;

    private int priceOfLitr = 55;

    @Override
    public void drive() {
        int distance = speedBus * amountOfTime;
    }

    @Override
    public void passenger(int busPassenger) {
        int money = price * busPassenger;
    }

    @Override
    public int fillUp(int amounOfFuel) {
        return amounOfFuel * priceOfLitr;
    }
}
