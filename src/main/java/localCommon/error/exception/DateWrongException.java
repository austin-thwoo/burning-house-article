package localCommon.error.exception;


import localCommon.error.model.ErrorCode;

public class DateWrongException extends BusinessException {
    public DateWrongException(String value) {
        super(value, ErrorCode.DATE_WRONG);
    }
}
