package com.dp.structural.bridge;

import org.junit.Before;
import org.junit.Test;

public class StackArrayTest {
    private Stack stack;

    @Before
    public void initialize() {
        System.out.println("***********************************************************************");
        this.stack = new Stack("array");

        for (int i = 0; i < 10; i++)
            this.stack.push(i);
    }

    @Test
    public void generate() {
        int expectedValue = 9;

        while (!this.stack.isEmpty()) {
            int value = this.stack.pop();
            System.out.println(value);
            assert value == expectedValue--;
        }
    }
}
