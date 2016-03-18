public class InvalidProbabilityException extends Throwable {
    public InvalidProbabilityException() {
        super("Probability should be between 0 to 1");
    }
}
