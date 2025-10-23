package exception;

public class ForbiddenException extends CommonException {

    public ForbiddenException(String message, Object data) {
        super(ResponseCode.FORBIDDEN, message, data);
    }

    public ForbiddenException(String message) {
        super(ResponseCode.FORBIDDEN, message);
    }
}
