package com.dp.structural.adapter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AdapterTest {
    @Mock private Line line;
    @Mock private Rectangle rectangle;

    @InjectMocks private LineAdapter lineAdapter;
    @InjectMocks private RectangleAdapter rectangleAdapter;

    @Test
    public void drawLine() {
        this.lineAdapter.draw(1, 10, 1, 10);
    }

    @Test
    public void drawRectangle() {
        this.rectangleAdapter.draw(1, 10, 5, 15);
    }
}
