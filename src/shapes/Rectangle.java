package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    int setLength() {
        return length;
    }

    @Override
    int setWidth() {
        return width;
    }
//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getPerimeter() {
//       return 2 * length + 2 * width;
//    }
//
//    public int getArea() {
//        return length * width;
//    }



}
