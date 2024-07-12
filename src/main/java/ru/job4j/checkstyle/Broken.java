package ru.job4j.checkstyle;

public class Broken {
    public int sizeOfEmpty = 10;
    public String surname;
    public static final String VALEO = "";
    public String name;

    Broken() {
    }

    public void echo() {
    }

    public void method(int a, int b, int c, int d, int e, int f, int g) {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }
}