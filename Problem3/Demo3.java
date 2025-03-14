package Problem3;

public class Demo3 {

    public static void main(String[] args) {
    
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        Shape[] shapes = new Shape[4];
        
        // Create different shapes and add them to the array
        shapes[0] = new Ellipse(5, 3);
        shapes[1] = new Triangle(3, 4, 5);
        shapes[2] = new EquilateralTriangle(6);
        shapes[3] = new Circle(4);  // This will be a circle
        
        // Print the details of each shape
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println();  // Empty line for separation
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }
}