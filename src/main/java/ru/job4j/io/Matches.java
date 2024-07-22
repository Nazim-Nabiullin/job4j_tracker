package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3: ");
            int matches = Integer.parseInt((input.nextLine()));
            if (1 <= matches && matches <= 3 && count >= matches) {
                count -= matches;
                System.out.println("Осталось " + count + " спичек на столе");
                turn = !turn;
            } else {
                System.out.println("Можно взять от 1 до 3 списек и при этом не более чем " + count
                        + " спичек в один момент. Сделайте еще одну попытку");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}