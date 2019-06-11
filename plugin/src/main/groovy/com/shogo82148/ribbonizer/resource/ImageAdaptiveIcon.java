package com.shogo82148.ribbonizer.resource;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageAdaptiveIcon extends Resource {
    private File file;
    private BufferedImage image;

    public File getFile() {
        return file;
    }

    public BufferedImage getImage()  {
        return image;
    }

    public ImageAdaptiveIcon(File file) throws IOException {
        this.file = file;
        image = ImageIO.read(file);
    }

    @Override
    public void apply(Filter filter) {
        filter.apply(this);
    }

    @Override
    public void save(File dir) throws IOException {
        ImageIO.write(image, "png", dir);
    }
}