package Problem4;

class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double side) {
        super(side, side, side);
        name = "Equilateral Triangle";
    }
    
    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}