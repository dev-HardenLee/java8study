package com.companywe.chagter8interface.polymorphism;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();

        car.tires[0] = new KumhoTire();
        car.tires[1] = new KumhoTire();
        car.tires[2] = new KumhoTire();
        car.tires[3] = new KumhoTire();

        car.run();
    }
}
