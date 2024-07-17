package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book sing = new Book("Песни народов мира", 256);
        Book history = new Book("История народов мира", 356);
        Book fairyTales = new Book("Песни народов мира", 456);
        Book cleanCode = new Book("Clean code", 556);
        Book[] books = new Book[4];
        books[0] = sing;
        books[1] = history;
        books[2] = fairyTales;
        books[3] = cleanCode;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPage() + " страниц.");
        }
        System.out.println();

        System.out.println("Переставим местами книги с индексом 0 и 3. Выведим содержимое массива на консоль.");
        Book temp = new Book(null, 0);
        temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPage() + " страниц.");
        }
        System.out.println();

        System.out.println("Добавим цикл с выводом книг с именем \"Clean code\"");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getPage() + " страниц.");
            }
        }
    }
}
