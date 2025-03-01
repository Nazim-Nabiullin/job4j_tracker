package ru.job4j.record;

import javax.sound.midi.Soundbank;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Иван", 30);
        System.out.println("Имя: " + person.getName() + ", Возраст: " + person.getAge());
        System.out.println(person);
        System.out.println();

        PersonRecord record = new PersonRecord("Иван", 30);
        System.out.println("Имя: " + record.name() + ", Возраст: " + record.age());
        System.out.println(record);
        System.out.println();

        PersonRecord record1 = new PersonRecord("Иван", 30);
        System.out.println(record.equals(record1));
        System.out.println();

        PersonRecord newRecord = new PersonRecord(record.name(), 35);
        System.out.println(newRecord);
    }
}
