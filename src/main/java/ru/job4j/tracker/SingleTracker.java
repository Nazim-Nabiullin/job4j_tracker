package ru.job4j.tracker;

public class SingleTracker {
    private Tracker tracker = new Tracker();
    private static SingleTracker instance;

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }
}
