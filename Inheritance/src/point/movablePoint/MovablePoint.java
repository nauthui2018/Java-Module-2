package point.movablePoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed = 0;
    private float ySpeed = 0;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        return "MovablePoint: " + Arrays.toString(super.getXY()) +
                ". Speed: " + Arrays.toString(this.getSpeed());
    }

    public MovablePoint move() {
        super.setXY(this.getX() + this.xSpeed,super.getY() + this.ySpeed);
        return this;
    }
}

