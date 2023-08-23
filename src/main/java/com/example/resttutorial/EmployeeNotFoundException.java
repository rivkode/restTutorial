package com.example.resttutorial;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("employee를 찾을 수 없음 " + id);
    }
}
