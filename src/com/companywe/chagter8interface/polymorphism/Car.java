package com.companywe.chagter8interface.polymorphism;

public class Car {
    Tire[] tires = {
            new HankookTire(),
            new HankookTire(),
            new HankookTire(),
            new HankookTire()
    };

    void run(){
        for (Tire tire : tires) {
            tire.roll();
        }
    }
}
