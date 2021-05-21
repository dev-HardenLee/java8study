package com.companywe.chagter8interface.use;

public interface RemoteControl {
    /**
     * 인터페이스 구성요소
     */

    // 상수
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드
        // public abstract가 생략되어있다.
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // default 메소드
        // public이 생략되어있다.
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리");
        }else{
            System.out.println("무음 해제");
        }
    }

    // static 타입 메소드
        // public이 생략되어있다.
    static void changeBattery(){
        System.out.println("건전지를 교환합니다.");
    }// changeBattery

}
