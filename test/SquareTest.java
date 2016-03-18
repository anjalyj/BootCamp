import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SquareTest {
    Square square;

    @Before
    public void setUp() throws InvalidScaleException {
        square = Square.create(3);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void square_gives_area_for_the_given_side() throws Exception {
        Assert.assertEquals(9.0, square.calculateArea(), 0);
    }

    @Test
    public void square_gives_perimeter_for_the_given_side() throws Exception {
        Assert.assertEquals(12.0, square.calculatePerimeter(), 0);
    }

    @Test
    public void square_throws_error_when_side_is_zero() throws InvalidScaleException {
        thrown.expectMessage("Expected positive but non positive value given");
        Square.create(0);
    }

    @Test
    public void square_throws_error_when_side_is_negative() throws InvalidScaleException {
        thrown.expectMessage("Expected positive but non positive value given");
        Square.create(-2);
    }
}
