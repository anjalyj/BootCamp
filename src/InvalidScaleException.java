public class InvalidScaleException extends Throwable {

    public InvalidScaleException() {
        super("Expected positive but non positive value given");
    }

}
