package Problem2;

class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    // Constructor that takes all parameters
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor that takes only xSpeed and ySpeed; x and y default to 0.
    public MovablePoint(float xSpeed, float ySpeed) {
        super(0.0f, 0.0f);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor where everything defaults to 0.
    public MovablePoint() {
        super(0.0f, 0.0f);
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    // String method
    @Override
    public String toString() {
        return super.toString() + ", Speed = ( " + xSpeed + ", " + ySpeed + " )";
    }

    // Getter methods
    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public float[] getSpeed() {
        return new float[] {xSpeed, ySpeed};
    }

    // Setter methods
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

    // Move method
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
