public class AccountException extends Throwable {
    private int code;
    public AccountException(int code, String message) {
        super(message);
        this.code = code;
    }
}
