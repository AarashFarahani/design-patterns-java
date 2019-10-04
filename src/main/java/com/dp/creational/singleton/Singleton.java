package com.dp.creational.singleton;

public class Singleton {
    private static Singleton instance;

    private int counter;

    private Singleton() {}

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }

    public int getCounter() {
        return counter++;
    }
}
