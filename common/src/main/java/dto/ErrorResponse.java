package dto;

import exception.ResponseCode;

public record ErrorResponse(
        int code,
        String message,
        Object data
) {

    public ErrorResponse(ResponseCode code) {
        this(code.getCode(), code.getMessage(), null);
    }

    public ErrorResponse(ResponseCode code, Object data) {
        this(code.getCode(), code.getMessage(), data);
    }
}
