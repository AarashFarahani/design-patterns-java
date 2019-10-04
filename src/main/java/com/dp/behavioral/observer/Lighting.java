package com.dp.behavioral.observer;

public class Lighting implements AlarmListener {
    public void alarm() {
        System.out.println("lights up");
    }
}
