package com.queirogaraffael.aurora.resort.domain.exception;

public abstract class StateConflictException extends DomainException {

    public StateConflictException(String message) {
        super(message);
    }
}
