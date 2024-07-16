package ru.job4j.inheritance;

public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat2 = new Cat2();
        animal.instanceInvoke();
        cat2.instanceInvoke();
        Animal.staticInvoke();
        Cat2.staticInvoke();

        System.out.println();

        cat2.staticInvoke();
        Animal other = null;
        other.staticInvoke();
        Cat2 kitty = new Cat2();
        kitty.staticInvoke();

    }
}
