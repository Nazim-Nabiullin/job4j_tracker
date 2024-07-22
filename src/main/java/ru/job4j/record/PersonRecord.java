package ru.job4j.record;

public record PersonRecord(String name, int age) {
    public static int maxAge = 100;

    public PersonRecord(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public record PersonRecord2(String name, int age) {
        public PersonRecord2 {
            if (age > 101) {
                throw new IllegalArgumentException("Возраст должен быть менее 101");
            }
        }
    }

    public record PersonRecord1(String name, int age) implements Comparable<PersonRecord> {
        @Override
        public int compareTo(PersonRecord o) {
            return name.compareTo(o.name);
        }
    }

    public static int getMaxAge() {
        return maxAge;
    }

    public void info() {
        System.out.println("Напечатать информацию");
    }

    @Override
    public String toString() {
        return "PersonRecord{"
                + "name='" + name + '\''
                + ", age=" + age
                + '}';
    }
}
