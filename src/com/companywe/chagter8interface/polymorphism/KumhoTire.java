package com.companywe.chagter8interface.polymorphism;

import com.companywe.chagter8interface.polymorphism.Tire;

public class KumhoTire implements Tire {
    @Override
    public void roll() {
        System.out.println("금호 타이어가 굴러간다.");
    }
}
