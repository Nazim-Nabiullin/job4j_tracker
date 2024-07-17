package ru.job4j.pojo;

import java.util.Objects;

public class Product {
    private String name;
    private int count;

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Product product = (Product) object;
        return count == product.count && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}