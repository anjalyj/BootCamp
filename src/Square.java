/*
    job - calculate Area and Perimeter
 */
public class Square extends Rectangle {
    private Square(double side) {
        super(side, side);
    }

    public static Square create(double side) throws InvalidScaleException {
        if (side <= 0)
            throw new InvalidScaleException();
        return new Square(side);
    }

}
