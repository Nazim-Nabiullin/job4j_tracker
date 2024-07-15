package ru.job4j.oop;

public class Parrot extends Bird {
    @Override
    public void fly() {
        System.out.println("Попугай пролетает на лужайкой");
    }

    public void flyInside() {
        System.out.println("Попугай летает только внутри анонимного класса");
    }
}
