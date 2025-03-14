package Problem4;

class Circle extends Ellipse {
    public Circle(double radius) {
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

    @Override
    public void scale(double factor) {
        a *= factor; // scale the radius
        b = a; // since it's a circle, both axes are the same
    }
}