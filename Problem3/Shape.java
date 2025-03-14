package Problem3;

abstract class Shape {
    String name;

    // Constructor to initialize the shape name
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods for area and perimeter
    public abstract double area();
    public abstract double perimeter();

    // String method
    @Override
    public String toString() {
        return "Shape: " + name + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
