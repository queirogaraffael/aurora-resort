package com.queirogaraffael.aurora.resort.domain.exception;

public abstract class ResourceNotFoundException extends DomainException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
