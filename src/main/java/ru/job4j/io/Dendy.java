package ru.job4j.io;

import java.util.Scanner;

public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Игры.");
            System.out.println("Танчики");
            System.out.println("Супер Марио");
            System.out.println("Выйти");
            System.out.println("Введите пункт меню, чтобы начать игру: ");
            int select = Integer.parseInt(input.nextLine());
            if (select == 3) {
                System.out.println("Игра завершена.");
                run = false;
            } else if (select == 1) {
                System.out.println("Танчики загружаются...");
            } else if (select == 2) {
                System.out.println("Супер Марио загружается...");
            } else {
                System.out.println("Такой игры нет.");
            }
            System.out.println();
        }
    }
}
