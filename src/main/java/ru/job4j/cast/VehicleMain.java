package ru.job4j.cast;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle airplain = new Airplain();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[] {airplain, train, bus};
        for (Vehicle object : vehicles) {
            object.move();
            object.accelerate();
            System.out.println();
        }

    }
}
