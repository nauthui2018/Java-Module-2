package resizeable;

import geometrics.Square;

public class ResizeSquare implements Resizeable<Square> {

    @Override
    public void resize(double percent, Square square) {
        double newSide = square.getSide() * Math.sqrt(percent + 1);
        square.setSide(newSide);
    }
}
