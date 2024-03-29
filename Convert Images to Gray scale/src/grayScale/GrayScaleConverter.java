package grayScale;

import edu.duke.*;

public class GrayScaleConverter {

    public ImageResource makeGray(ImageResource inImage) {
        ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());
        for (Pixel pixel : outImage.pixels()) {
            Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
            int average = (inPixel.getRed() + inPixel.getGreen() + inPixel.getBlue()) / 3;
            pixel.setRed(average);
            pixel.setBlue(average);
            pixel.setGreen(average);

        }
        return outImage;
    }

    public void testGray() {
        ImageResource ir = new ImageResource();
        ir.draw();
        ImageResource gray = makeGray(ir);
        gray.draw();
    }

    public static void main(String[] args) {
        GrayScaleConverter gSC = new GrayScaleConverter();
        gSC.testGray();
    }
}
