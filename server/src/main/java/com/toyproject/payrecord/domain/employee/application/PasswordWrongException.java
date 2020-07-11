package com.toyproject.payrecord.domain.employee.application;

public class PasswordWrongException extends RuntimeException{

    public PasswordWrongException() {
        super();
    }

    public PasswordWrongException(String message) {
        super(message);
    }

    public PasswordWrongException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordWrongException(Throwable cause) {
        super(cause);
    }
}
