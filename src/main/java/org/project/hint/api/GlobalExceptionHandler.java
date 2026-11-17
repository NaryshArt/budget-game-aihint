package org.project.hint.api;

import org.project.hint.exception.TooManyHintsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidation(MethodArgumentNotValidException ex) {
        return null; // TODO
    }

    @ExceptionHandler(TooManyHintsException.class)
    public ResponseEntity<Map<String, String>> handleTooManyHints(TooManyHintsException ex) {
        return null; // TODO: 429
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleUnexpected(Exception ex) {
        return null; // TODO: 500
    }
}
