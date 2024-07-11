package ru.job4j.oop;

public class Cat {
    private String name;

    private String food;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println("Имя кота - " + this.name + ". И он съел " + this.food);
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }

      public static void main(String[] args) {
          System.out.println("There are gav's food.");
          Cat gav = new Cat();
          gav.eat("kotleta");
          gav.giveNick("Гав");
          gav.show();
          System.out.println();
          System.out.println("There are black's food.");
          Cat black = new Cat();
          black.giveNick("Черный");
          black.eat("fish");
          black.show();

    }
}
