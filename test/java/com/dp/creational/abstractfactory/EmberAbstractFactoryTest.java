package com.dp.creational.abstractfactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmberAbstractFactoryTest {
    private AbstractFactory factory;

    @Before
    public void initialize() {
        this.factory = AbstractFactory.getFactory(Architecture.EMBER);
    }

    @Test
    public void createCPU() {
        CPU cpu = this.factory.createCPU();
        assertEquals(cpu.getClass(), EmberCPU.class);
    }

    @Test
    public void createMMU() {
        MMU mmu = factory.createMMU();
        assertEquals(mmu.getClass(), EmberMMU.class);
    }
}
