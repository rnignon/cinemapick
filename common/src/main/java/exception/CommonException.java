package exception;

public class CommonException extends RuntimeException {

    private final ResponseCode code;
    private final Object data;

    public CommonException(ResponseCode code, String message, Object data) {
        super(message);
        this.code = code;
        this.data = data;
    }

    public CommonException(ResponseCode code, String message) {
        super(message);
        this.code = code;
        this.data = null;
    }
}
