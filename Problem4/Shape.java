package Problem4;

abstract class Shape implements Scalable {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape: " + name + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
