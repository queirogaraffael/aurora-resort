package com.queirogaraffael.aurora.resort.infrastructure.security.exception;

public class TokenCreationException extends RuntimeException {
    public TokenCreationException(String message, Throwable cause) {
        super(message, cause);
    }
}
