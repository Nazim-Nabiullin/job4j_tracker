package ru.job4j.oop;

public class JukeboxWithSwitch {
    public String musicWithSwitchMatcher(int position) {
        String result = switch (position) {
            case 1 -> "Пусть бегут неуклюже";
            case 2 -> "Спокойной ночи";
            default -> "Песня не найдена";
        };
        return result;
    }

    public static void main(String[] args) {
        JukeboxWithSwitch jukeboxWithSwitch = new JukeboxWithSwitch();
        System.out.println(jukeboxWithSwitch.musicWithSwitchMatcher(1));
        System.out.println(jukeboxWithSwitch.musicWithSwitchMatcher(2));
        System.out.println(jukeboxWithSwitch.musicWithSwitchMatcher(0));
        System.out.println(jukeboxWithSwitch.musicWithSwitchMatcher(3));
        System.out.println(jukeboxWithSwitch.musicWithSwitchMatcher(-3));
    }
}