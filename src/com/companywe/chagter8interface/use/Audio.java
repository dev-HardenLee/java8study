package com.companywe.chagter8interface.use;

public class Audio implements RemoteControl{

    private int volume;
    private boolean mute;

    @Override
    public void turnOn() {
        System.out.println("AUDIO를 킨다");
    }

    @Override
    public void turnOff() {
        System.out.println("AUDIO를 끈다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 AUDIO volume = " + volume);
    }

    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if(mute){
            System.out.println("Audio 묵음처리");
        }else{
            System.out.println("Audio 무음해제");
        }
    }
}
