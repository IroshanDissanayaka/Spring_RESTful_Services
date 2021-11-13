package com.iroshan.springrestfulservices;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
            super("Could not find Order " + id);
    }
}
