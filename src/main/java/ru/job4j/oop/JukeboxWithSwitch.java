package ru.job4j.oop;

public class JukeboxWithSwitch {
    public void music(int position) {
        switch (position) {
            case 1:
                System.out.println("Пусть бегут неуклюже");
                break;
            case 2:
                System.out.println("Спокойной ночи");
                break;
            default:
                System.out.println("Песня не найдена");
                break;
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
