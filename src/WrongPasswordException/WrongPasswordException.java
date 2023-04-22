package WrongPasswordException;

public class WrongPasswordException extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Не корректный пароль";

    public WrongPasswordException() {
        this(DEFAULT_MESSAGE);
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
