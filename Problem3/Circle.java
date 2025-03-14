package Problem3;

class Circle extends Ellipse {
    public Circle(double radius) {
        // Since a circle is an ellipse with a = b, we call the Ellipse constructor with radius for both axes
        super(radius, radius);
    }

    @Override
    public double area() {
        return Math.PI * a * a;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * a;
    }
}