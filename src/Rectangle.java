/*
    job - calculate Area and Perimeter
 */
public class Rectangle {
    private final double length;
    private final double breadth;

    protected Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle create(double length, double breadth) throws InvalidScaleException {
        if (length <= 0 || breadth <= 0)
            throw new InvalidScaleException();
        return new Rectangle(length, breadth);
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
