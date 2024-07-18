package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
     private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public boolean replace(int id, Item item) {
        boolean trueReplace = false;
        int index = indexOf(id);
        if (index != -1) {
            items[index] = item;
            trueReplace = true;
        }
        return trueReplace;
    }

    public Item[] findAll() {
        Item[] resultItems = new Item[size];
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null) {
                resultItems[index] = item;
            }
        }
        return Arrays.copyOf(resultItems, size);
    }

    public Item[] findByName(String key) {
        Item[] resultItems = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (key.equals(item.getName())) {
                resultItems[index] = item;
                count++;
            }
        }
        return Arrays.copyOf(resultItems, count);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }
}