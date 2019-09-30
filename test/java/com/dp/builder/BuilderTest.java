package com.dp.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BuilderTest {
    private Waiter waiter;

    @Before
    public void initialize() {
        this.waiter = new Waiter();
    }

    @Test
    public void prepareHawaiianPizza() {
        PizzaBuilder pizzaBuilder = new HawaiianPizzaBuilder();
        this.waiter.setPizzaBuilder(pizzaBuilder);
        this.waiter.constructPizza();
        Pizza pizza = this.waiter.getPizza();
        assertEquals(pizza.getSauce(), "mild");
    }

    @Test
    public void prepareSpicyPizza() {
        PizzaBuilder pizzaBuilder = new SpicyPizzaBuilder();
        waiter.setPizzaBuilder(pizzaBuilder);
        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();
        assertEquals(pizza.getSauce(), "hot");
    }
}
