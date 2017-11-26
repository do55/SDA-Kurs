package com.sdaMRymarczyk;

public class OrderStateException extends OrderException {

    public OrderStateException() {
        super();
    }

    public OrderStateException(String message) {
        super(message);
    }

    public OrderStateException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderStateException(Throwable cause) {
        super(cause);
    }
}
