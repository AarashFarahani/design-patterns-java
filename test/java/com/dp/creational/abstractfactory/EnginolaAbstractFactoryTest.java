package com.dp.creational.abstractfactory;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EnginolaAbstractFactoryTest {
    private AbstractFactory factory;

    @Before
    public void initialize() {
        this.factory = AbstractFactory.getFactory(Architecture.ENGINOLA);
    }

    @Test
    public void createCPU() {
        CPU cpu = this.factory.createCPU();
        assertEquals(cpu.getClass(), EnginolaCPU.class);
    }

    @Test
    public void createMMU() {
        MMU mmu = factory.createMMU();
        assertEquals(mmu.getClass(), EnginolaMMU.class);
    }
}
