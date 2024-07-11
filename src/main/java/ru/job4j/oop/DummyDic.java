package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String frase = "Неизвестное слово. " + eng;
        return frase;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String eng = "English";
        System.out.println(dic.engToRus(eng));
    }
}
