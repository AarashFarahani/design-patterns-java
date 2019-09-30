package com.dp.abstractfactory;

import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void getFactory() {
        AbstractFactory factory = AbstractFactory.getFactory(Architecture.EMBER);
        CPU cpu = factory.createCPU();
    }
}
