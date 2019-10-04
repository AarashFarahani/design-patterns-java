package com.dp.behavioral.observer;

import org.junit.Test;

public class ObserverTest {
    @Test
    public void soundTheAlarm() {
        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(new Gates());
        sensorSystem.register(new Lighting());
        sensorSystem.register(new Surveillance());
        sensorSystem.soundTheAlarm();
    }
}
