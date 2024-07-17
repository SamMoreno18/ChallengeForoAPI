package com.forohub.ForoHub_API.REST.errors;

import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.CONFLICT;

public class ManejoDeErrores extends RuntimeException{
    private final HttpStatus status;

    public ManejoDeErrores(String message) {
        super(message);
        this.status = CONFLICT;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
