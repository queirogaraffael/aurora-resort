package com.queirogaraffael.aurora.resort.infrastructure.security.exception;

public class RefreshTokenInvalidException extends RuntimeException {
    public RefreshTokenInvalidException(String message) {
        super(message);
    }
}
