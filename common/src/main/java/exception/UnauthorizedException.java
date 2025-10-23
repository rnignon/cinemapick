package exception;

public class UnauthorizedException extends CommonException {

    public UnauthorizedException(String message, Object data) {
        super(ResponseCode.UNAUTHORIZED, message, data);
    }

    public UnauthorizedException(String message) {
        super(ResponseCode.UNAUTHORIZED, message);
    }
}
