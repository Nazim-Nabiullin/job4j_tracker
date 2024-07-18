package ru.job4j.tracker;

public class UserStore {
    public static void main(String[] args) {
        User user = new User(1, "root", "root");
        String greeting = "Hello " + user;
        System.out.println(greeting);
        System.out.println();
        System.out.println("User: "
        + user.getId() + " "
        + user.getUsername() + " "
        + user.getPassword()
        );
    }
}
