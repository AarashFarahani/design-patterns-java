package com.dp.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void sameObject() {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        Assert.assertEquals(obj1, obj2);
    }

    @Test
    public void sameHashCode() {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        Assert.assertEquals(obj1.hashCode(), obj2.hashCode());
    }

    @Test
    public void counter() {
        Singleton instance = Singleton.getInstance();

        Assert.assertEquals(instance.getCounter(), 0);
        Assert.assertEquals(instance.getCounter(), 1);
        Assert.assertEquals(instance.getCounter(), 2);
    }
}
