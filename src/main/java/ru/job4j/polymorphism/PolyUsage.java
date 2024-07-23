package ru.job4j.polymorphism;

import javax.lang.model.element.AnnotationMirror;

public class PolyUsage {
    public static void main(String[] args) {
        Animal cow = new Cow();
        Animal goose = new Goose();
        Animal dog = new Dog();
        Animal guineaPig = new GuineaPig();

        Animal[] animals = new Animal[]{cow, goose, dog, guineaPig};
        for (Animal object : animals) {
            object.sound();
        }
    }
}
