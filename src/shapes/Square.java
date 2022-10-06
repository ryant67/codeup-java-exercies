package shapes;

public class Square extends Quadrilateral {
    protected int side;
    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return ((int) Math.pow(side, 2));
    }

    @Override
    protected int setLength() {
        return length;
    }

    @Override
    protected int setWidth() {
        return width;
    }
//    protected int side;
//    public Square(int side) {
//        super(side, side);
//    }
//
//    @Override
//    public int getArea() {
//        return ((int) Math.pow(side, 2));
//    }
//
//    @Override
//    public int getPerimeter() {
//        return 4 * side;
//    }



}
