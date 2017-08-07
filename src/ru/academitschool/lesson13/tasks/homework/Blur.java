package ru.academitschool.lesson13.tasks.homework;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blur {
    public static void main(String[] args) throws IOException {
        BufferedImage imageIn = ImageIO.read(new File("image.jpg"));
        WritableRaster rasterIn = imageIn.getRaster();

        int width = rasterIn.getWidth();
        int height = rasterIn.getHeight();

        BufferedImage imageOut = new BufferedImage(width, height, imageIn.getType());
        WritableRaster rasterOut = imageOut.getRaster();

        final int COLORS_COUNT_IN_RGB = 3;

        int[] pixelTopLeft = new int[COLORS_COUNT_IN_RGB];
        int[] pixelTop = new int[COLORS_COUNT_IN_RGB];
        int[] pixelTopRight = new int[COLORS_COUNT_IN_RGB];
        int[] pixelLeft = new int[COLORS_COUNT_IN_RGB];
        int[] pixel = new int[COLORS_COUNT_IN_RGB];
        int[] pixelRight = new int[COLORS_COUNT_IN_RGB];
        int[] pixelBottomLeft = new int[COLORS_COUNT_IN_RGB];
        int[] pixelBottom = new int[COLORS_COUNT_IN_RGB];
        int[] pixelBottomRight = new int[COLORS_COUNT_IN_RGB];

        for (int y = 1; y < height - 1; ++y) {
            for (int x = 1; x < width - 1; ++x) {
                rasterIn.getPixel(x - 1, y - 1, pixelTopLeft);
                rasterIn.getPixel(x, y - 1, pixelTop);
                rasterIn.getPixel(x + 1, y - 1, pixelTopRight);
                rasterIn.getPixel(x - 1, y, pixelLeft);
                rasterIn.getPixel(x, y, pixel);
                rasterIn.getPixel(x + 1, y, pixelRight);
                rasterIn.getPixel(x - 1, y + 1, pixelBottomLeft);
                rasterIn.getPixel(x, y + 1, pixelBottom);
                rasterIn.getPixel(x + 1, y + 1, pixelBottomRight);

                for (int k = 0; k < COLORS_COUNT_IN_RGB; ++k) {
                    pixel[k] = (int) ((pixelTopLeft[k] + pixelTop[k] + pixelTopRight[k] +
                            pixelLeft[k] + pixel[k] + pixelRight[k] +
                            pixelBottomLeft[k] + pixelBottom[k] + pixelBottomRight[k]) / 9.0);
                }
                rasterOut.setPixel(x, y, pixel);
            }
        }
        ImageIO.write(imageOut, "jpg", new File("out.jpg"));
    }
}
