package com.dp.structural.bridge;

import org.junit.Before;
import org.junit.Test;

public class StackHanoiTest {
    private Stack stack;

    @Before
    public void initialize() {
        System.out.println("***********************************************************************");
        this.stack = new StackHanoi();

        for (int i = 9; i >= 0; i--)
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
