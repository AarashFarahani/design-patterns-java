package com.dp.bridge;

import org.junit.Before;
import org.junit.Test;

public class BridgeTest {
    @Before
    public void separateResult() {
        System.out.println("***********************************************************************");
    }

    @Test
    public void generateStackArray() {
        Stack stack = new Stack("array");

        for (int i = 0; i < 10; i++)
            stack.push(i);

        int expectedValue = 9;

        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println(value);
            assert value == expectedValue--;
        }
    }

    @Test
    public void generateStackList() {
        Stack stack = new Stack("list");

        for (int i = 0; i < 10; i++)
            stack.push(i);

        int expectedValue = 9;

        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println(value);
            assert value == expectedValue--;
        }
    }

    @Test
    public void generateStackFIFO() {
        Stack stack = new StackFIFO();

        for (int i = 0; i < 10; i++)
            stack.push(i);

        int expectedValue = 0;

        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println(value);
            assert value == expectedValue++;
        }
    }

    @Test
    public void generateStackHanoi() {
        Stack stack = new StackHanoi();

        for (int i = 9; i >= 0; i--)
            stack.push(i);

        int expectedValue = 0;

        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println(value);
            assert value == expectedValue++;
        }
    }
}
