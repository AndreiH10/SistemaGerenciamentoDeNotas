package org.example;

public class NotaInvalidaException extends RuntimeException {
    public NotaInvalidaException(String message) {
        super(message);
    }
}
