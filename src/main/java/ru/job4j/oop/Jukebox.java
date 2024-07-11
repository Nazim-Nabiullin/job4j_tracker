package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox setSing = new Jukebox();
        setSing.music(1);
        setSing.music(2);
        setSing.music(0);
        setSing.music(3);
        setSing.music(-1);
    }
}
