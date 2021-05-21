package com.companywe.chagter8interface.compulsiontypechange;

public class VehicleExample {
    public static void main(String[] args) {

        Vehicle vehicle = new Bus();

        vehicle.run();
        //vehicle.checkFare(); 에러

        Bus bus = (Bus)vehicle;

        bus.run();
        bus.checkFare();
    }
}
