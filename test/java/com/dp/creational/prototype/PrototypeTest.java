package com.dp.creational.prototype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class PrototypeTest {
    @Test
    public void createTom() {
        Person person = Factory.getPrototype("tom");
        assertNotNull(person);
        assertEquals(person.getClass(), Tom.class);
    }

    @Test
    public void createHarry() {
        Person person = Factory.getPrototype("harry");
        assertNotNull(person);
        assertEquals(person.getClass(), Harry.class);
    }

    @Test
    public void createDick() {
        Person person = Factory.getPrototype("dick");
        assertNotNull(person);
        assertEquals(person.getClass(), Dick.class);
    }
}
