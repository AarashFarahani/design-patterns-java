package com.dp.bridge;

import org.junit.Before;
import org.junit.Test;

public class StackFIFOTest {
    private Stack stack;

    @Before
    public void initialize() {
        System.out.println("***********************************************************************");
        this.stack = new StackFIFO();

        for (int i = 0; i < 10; i++)
            this.stack.push(i);
    }

    @Test
    public void generate() {
        int expectedValue = 0;

        while (!this.stack.isEmpty()) {
            int value = this.stack.pop();
            System.out.println(value);
            assert value == expectedValue++;
        }
    }
}
