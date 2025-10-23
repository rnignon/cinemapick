package exception;

public class BadRequestException extends CommonException {

    public BadRequestException(String message, Object data) {
        super(ResponseCode.BAD_REQUEST, message, data);
    }

    public BadRequestException(String message) {
        super(ResponseCode.BAD_REQUEST, message);
    }
}
