package com.example.resttutorial;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
        super("Order을 찾을 수 없음" + id);
    }
}
