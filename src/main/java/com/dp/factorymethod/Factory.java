package com.dp.factorymethod;

public class Factory {
    public ImageReader create(String fileName) {
        String extension = fileName.split("\\.")[1];

        if(extension.equalsIgnoreCase("gif"))
            return new GifReader(fileName);
        else if(extension.equalsIgnoreCase("jpeg"))
            return new JpegReader(fileName);

        return null;
    }
}
