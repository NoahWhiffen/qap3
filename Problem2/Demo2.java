package Problem2;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        Point p1 = new Point(); // Point object using the default constructor
        Point p2 = new Point(); // Point object using the constructor with parameters
        MovablePoint mp1 = new MovablePoint(2.0f, 3.0f, 1.5f, 2.5f); // MovablePoint with using all parameters
        MovablePoint mp2 = new MovablePoint(0.5f, 1.0f); // MovablePoint using only speed parameters

        // Test string methods
        System.out.println("Point 1: " + p1.toString());
        System.out.println("Point 2: " + p2.toString());
        System.out.println("Movable Point 1: " + mp1.toString());
        System.out.println("Movable Point 2: " + mp2.toString());

        // Test getters for Point
        System.out.println("Point 1 X: " + p1.getX());
        System.out.println("Point 1 Y: " + p1.getY());

        float[] pointCoords = p1.getXY();
        System.out.println("Point 1 coordinates using getXY: (" + pointCoords[0] + ", " + pointCoords[1] + ")");

        // Test setters for Point
        p1.setX(10.5f);
        p1.setY(20.5f);
        System.out.println("Point 1 (After setting new X and Y): " + p1);
        
        // Test getters for MovablePoint
       System.out.println("MovablePoint 1 X Speed: " + mp1.getXSpeed());
       System.out.println("MovablePoint 1 Y Speed: " + mp1.getYSpeed());

       float[] mpSpeed = mp1.getSpeed();
       System.out.println("MovablePoint 1 speeds using getSpeed: (" + mpSpeed[0] + ", " + mpSpeed[1] + ")");

        // Test setters for MovablePoint
        mp1.setXSpeed(4.0f);
        mp1.setYSpeed(5.0f);
        System.out.println("MovablePoint 1 (After setting new speeds): " + mp1);

        // Move the movable point and display it's new position
        mp1.move();
        System.out.println("Movable Point 1 (After move): " + mp1);


        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }
}
