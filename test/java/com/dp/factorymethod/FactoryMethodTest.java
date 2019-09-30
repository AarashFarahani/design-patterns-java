package com.dp.factorymethod;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class FactoryMethodTest {
    private static Factory factory;

    @BeforeClass
    public static void initializeClass() {
        factory = new Factory();
    }

    @Test
    public void createGifReader() {
        ImageReader imageReader = factory.create("test.gif");
        assert imageReader != null;

        DecodedImage decodedImage = imageReader.getDecodeImage();
        assertEquals(imageReader.getClass(), GifReader.class);

        System.out.println(decodedImage.toString());
    }

    @Test
    public void createJpegReader() {
        ImageReader imageReader = factory.create("test.jpeg");
        assert imageReader != null;

        DecodedImage decodedImage = imageReader.getDecodeImage();
        assertEquals(imageReader.getClass(), JpegReader.class);

        System.out.println(decodedImage.toString());
    }
}
