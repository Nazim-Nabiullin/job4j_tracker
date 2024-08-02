package ru.job4j.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionUsage {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        System.out.println("Размер коллекции равен: " + collection.size());
        System.out.println("Коллекция содержит элемент two: " + collection.contains("two"));
        System.out.println("Содержимое в виде массива: " + Arrays.toString(collection.toArray()));
        collection.clear();
        System.out.println("Коллекция после очистки пуста: " + collection.isEmpty());
        System.out.println();

        ArrayList names = new ArrayList();
        names.add("Petr");
        names.set(0, "Ivan");
        for (int i = 0; i < names.size(); i++) {
            Object value = names.get(i);
            System.out.println(value);
            System.out.println();
        }
        for (Object value : names) {
            System.out.println(value);
        }

        ArrayList<String> namess = new ArrayList<String>();

    }
}
