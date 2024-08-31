package edu.nf.yxdsso.exception;

/**
 * @author YXD
 * @date 2024/8/31
 */
public class AccessException extends RuntimeException {
    public AccessException(String message) {
        super(message);
    }

    public AccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessException(Throwable cause) {
        super(cause);
    }
}
