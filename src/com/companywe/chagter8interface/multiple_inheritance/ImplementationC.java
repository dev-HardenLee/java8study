package com.companywe.chagter8interface.multiple_inheritance;

public class ImplementationC implements InterfaceC{
    @Override
    public void methodA() {
        System.out.println("ImplementC - interfaceA 실행");
    }

    @Override
    public void methodB() {
        System.out.println("ImplementC - interfaceB 실행");
    }

    @Override
    public void mehtodC() {
        System.out.println("ImplementC - interfaceC 실행");
    }
}
