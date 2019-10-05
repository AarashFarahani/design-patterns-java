package com.dp.behavioral.strategy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StrategyTest {
    @Test
    public void solve() {
        List<Strategy> strategies = Arrays.asList(new Bar(), new Foo());
        for (Strategy strategy : strategies) {
            strategy.solve();
        }
    }
}
