package ru.job4j.concat;

public class Example {
    public static void main(String[] args) {
        String name = "Dog";
        change(name);
        System.out.print(name);
        name = change(name);
        System.out.print(name);
    }

    public static String change(String name) {
        name = name + "Cat";
        String surname = "Kotov";
        return surname;
    }
}
