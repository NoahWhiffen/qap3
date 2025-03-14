package Problem3;

class Triangle extends Shape {
    double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        super("Triangle");

        // Check if the sides form a valid triangle
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
            System.out.println("Error: The sides do not form a valid triangle.");
            System.exit(1);
        }
        
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

