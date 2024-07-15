package ru.job4j.oop;

public class JukeboxWithSwitch {
    public void music(int position) {
        String result = switch (position) {
            case 1 -> "Пусть бегут неуклюже";
            case 2 -> "Спокойной ночи";
            default -> "Песня не найдена";
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        JukeboxWithSwitch jukeboxWithSwitch = new JukeboxWithSwitch();
        jukeboxWithSwitch.music(1);
        jukeboxWithSwitch.music(2);
        jukeboxWithSwitch.music(0);
        jukeboxWithSwitch.music(3);
        jukeboxWithSwitch.music(-3);

    }
}