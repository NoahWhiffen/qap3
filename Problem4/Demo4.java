package Problem4;

public class Demo4 {
    
    // Static method to scale shapes and print details before and after scaling
    public static void scaleShapes(Scalable[] shapes, double factor) {

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Shapes before scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
            System.out.println();
        }

        // Scale each shape in the array
        for (Scalable shape : shapes) {
            shape.scale(factor); 
        }
        System.out.println("Shapes after scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape); 
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create objects of different shapes
        Shape circle = new Circle(5);
        Shape ellipse = new Ellipse(6, 4);
        Shape triangle = new Triangle(3, 4, 5);
        Shape equilateralTriangle = new EquilateralTriangle(6);

        // Store objects in an array of type Scalable
        Scalable[] shapes = { (Scalable) circle, (Scalable) ellipse, (Scalable) triangle, (Scalable) equilateralTriangle };

        scaleShapes(shapes, 2);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }
}