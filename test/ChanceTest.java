import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChanceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void chance_cannot_be_created_with_value_greater_than_1() throws InvalidProbabilityException {
        thrown.expect(InvalidProbabilityException.class);
        thrown.expectMessage("Probability should be between 0 to 1");
        Chance.create(2);
    }

    @Test
    public void chance_cannot_be_created_with_value_lesser_than_0() throws InvalidProbabilityException {
        thrown.expect(InvalidProbabilityException.class);
        thrown.expectMessage("Probability should be between 0 to 1");
        Chance.create(-2);
    }
    @Test
    public void chance_can_be_negated() throws InvalidProbabilityException {
        Chance chance = Chance.create(0.75);
        Chance expected = Chance.create(0.25);
        assertTrue(chance.not().equals(expected));
    }

    @Test
    public void chances_can_be_multiplied() throws InvalidProbabilityException {
        Chance chance = Chance.create(0.75);
        Chance chance1 = Chance.create(0.25);
        Chance expected = Chance.create(0.1875);
        assertEquals(expected,chance.and(chance1));
    }
    @Test
    public void chances_can_be_added() throws InvalidProbabilityException {
        Chance chance = Chance.create(0.75);
        Chance chance1 = Chance.create(0.25);
        Chance expected = Chance.create(1);
        assertEquals(expected,chance.or(chance1));
    }

}
