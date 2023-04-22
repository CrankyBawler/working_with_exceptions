public class WrongLoginException extends RuntimeException {


    private static final String DEFAULT_MESSAGE = "Логин слишком длинный или содержит запрещенные символы";

    public WrongLoginException() {
        this(DEFAULT_MESSAGE);
    }

    public WrongLoginException(String message) {
        super(message);
    }
}