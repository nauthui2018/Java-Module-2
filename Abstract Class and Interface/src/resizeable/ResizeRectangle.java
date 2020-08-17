package resizeable;

import geometrics.Rectangle;

public class ResizeRectangle implements Resizeable<Rectangle> {

    @Override
    public void resize(double percent, Rectangle rectangle) {
        double newWidth = rectangle.getWidth() * Math.sqrt(percent + 1);
        rectangle.setWidth(newWidth);
        double newLength = rectangle.getLength() * Math.sqrt(percent + 1);
        rectangle.setLength(newLength);
    }
}
