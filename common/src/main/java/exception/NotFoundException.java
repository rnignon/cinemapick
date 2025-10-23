package exception;

public class NotFoundException extends CommonException {

    public NotFoundException(String message, Object data) {
        super(ResponseCode.NOT_FOUND, message, data);
    }

    public NotFoundException(String message) {
        super(ResponseCode.NOT_FOUND, message);
    }
}
