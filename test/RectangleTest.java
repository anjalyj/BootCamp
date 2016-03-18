import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class RectangleTest {
    Rectangle rectangleWithEqualLengthBreadth;
    Rectangle rectangleWithLengthHalfOfBreadth;

    @Before
    public void setUp() throws InvalidScaleException {
        rectangleWithEqualLengthBreadth = Rectangle.create(20, 20);
        rectangleWithLengthHalfOfBreadth = Rectangle.create(1.2, 2.4);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void rectangle_gives_area_when_length_breadth_are_same() {
        assertEquals(400, rectangleWithEqualLengthBreadth.calculateArea(), 0);
    }

    @Test
    public void rectangle_gives_area_when_length_half_of_breadth() {
        assertEquals(2.88, rectangleWithLengthHalfOfBreadth.calculateArea(), 0);
    }

    @Test
    public void rectangle_gives_perimeter_when_length_breadth_are_same() {
        assertEquals(80, rectangleWithEqualLengthBreadth.calculatePerimeter(), 0);
    }

    @Test
    public void rectangle_gives_perimeter_when_length_half_of_breadth() {
        assertEquals(7.20, rectangleWithLengthHalfOfBreadth.calculatePerimeter(), 0.1);
    }

    @Test
    public void rectangle_throws_error_when_length_and_breadth_is_zero() throws InvalidScaleException {
        thrown.expectMessage("Expected positive but non positive value given");
        Rectangle.create(0, 0);
    }

    @Test
    public void rectangle_throws_error_when_length_is_negative() throws InvalidScaleException {
        thrown.expectMessage("Expected positive but non positive value given");
        Rectangle.create(-1, 10);
    }

    @Test
    public void rectangle_throws_error_when_breadth_is_negative() throws InvalidScaleException {
        thrown.expectMessage("Expected positive but non positive value given");
        Rectangle.create(10, -10);
    }
}
