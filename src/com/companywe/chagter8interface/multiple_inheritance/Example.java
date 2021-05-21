package com.companywe.chagter8interface.multiple_inheritance;

public class Example {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;
        ia.methodA(); // method A만 호출가능

        System.out.println("=================");

        InterfaceB ib = impl;
        ib.methodB(); // method B만 호출가능

        System.out.println("=================");

        InterfaceC ic = impl;

        ic.methodA();
        ic.methodB();
        ic.mehtodC(); // 모두 호출 가능
    }
}
