package ru.job4j.inheritance;

public class ToyCat extends Cat {
    public boolean canBeWachByWashMaschine() {
        return true;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.canPutt());
        ToyCat toy = new ToyCat();
        System.out.println(toy.canPutt());
        System.out.println(toy.canBeWachByWashMaschine());
    }
}
