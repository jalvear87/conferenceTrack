package com.conference.exception;

import com.conference.common.StandarizedApiExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 *
 */
@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleUnknownHostException(Exception ex) {
        StandarizedApiExceptionResponse standarizedApiExceptionResponse = new StandarizedApiExceptionResponse("ACCESS SERVICE", "INTERNAL_SERVER_ERROR", "1024", ex.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(standarizedApiExceptionResponse);
    }

    @ExceptionHandler(BussinesRuleException.class)
    public ResponseEntity<?> handleBussinesRuleException(BussinesRuleException ex) {
        StandarizedApiExceptionResponse standarizedApiExceptionResponse = new StandarizedApiExceptionResponse("LOGICA BUSSINES", "Error", ex.getCode(), ex.getMessage());
        return ResponseEntity.status(ex.getHttpStatus()).body(standarizedApiExceptionResponse);
    }
}
