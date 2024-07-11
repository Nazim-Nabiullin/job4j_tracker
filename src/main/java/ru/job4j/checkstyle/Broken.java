package ru.job4j.checkstyle;

public class Broken {
    int sizeOfEmpty = 10;
    public String surname;
    public static final String VALEO = "";
    String name;

    void echo() {
    }

    void method(int a, int b, int c, int d, int e, int f, int g) {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    Broken() {
    }
}