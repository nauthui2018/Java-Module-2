package resizeable;

import geometrics.Circle;

public class ResizeCircle implements Resizeable<Circle> {
    // resize the circle
    @Override
    public void resize(double percent, Circle circle) {
        double currentRadius = circle.getRadius();
        double newRadius = (Math.sqrt(percent + 1)) * currentRadius;
        circle.setRadius(newRadius);
    }
}
