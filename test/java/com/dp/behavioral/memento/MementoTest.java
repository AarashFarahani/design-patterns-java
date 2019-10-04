package com.dp.behavioral.memento;

import org.junit.BeforeClass;
import org.junit.Test;

public class MementoTest {
    private final static String STATE_1 = "State 1";
    private final static String STATE_2 = "State 2";
    private final static String STATE_3 = "State 3";

    private static Caretaker caretaker;
    private static Originator originator;

    @BeforeClass
    public static void initialize() {
        caretaker = new Caretaker();
        originator = new Originator();
    }

    @Test
    public void save() {
        originator.setState(STATE_1);
        originator.setState(STATE_2);
        caretaker.addMemento(originator.save());

        Memento memento = caretaker.getMemento();
        assert memento.getState().equals(STATE_2);
    }

    @Test
    public void restore() {
        originator.setState(STATE_3);
        caretaker.addMemento(originator.save());
        originator.restore(caretaker.getMemento());

        Memento memento = caretaker.getMemento();
        assert memento.getState().equals(STATE_2);
    }
}
