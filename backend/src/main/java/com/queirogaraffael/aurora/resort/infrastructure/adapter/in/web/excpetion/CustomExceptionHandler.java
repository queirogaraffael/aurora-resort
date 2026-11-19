package com.queirogaraffael.aurora.resort.infrastructure.adapter.in.web.excpetion;

import com.queirogaraffael.aurora.resort.domain.exception.ResourceNotFoundException;
import com.queirogaraffael.aurora.resort.domain.exception.StateConflictException;
import com.queirogaraffael.aurora.resort.domain.exception.ValidationException;
import com.queirogaraffael.aurora.resort.infrastructure.security.exception.TokenCreationException;
import com.queirogaraffael.aurora.resort.infrastructure.security.exception.RefreshTokenInvalidException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(StateConflictException.class)
    public ResponseEntity<Object> handleStateConflictException(StateConflictException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<Object> handleValidationException(ValidationException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(TokenCreationException.class)
    public ResponseEntity<Object> handleTokenCreationException(TokenCreationException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(RefreshTokenInvalidException.class)
    public ResponseEntity<Object> handleRefreshTokenInvalidException(RefreshTokenInvalidException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleGeneralException(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
