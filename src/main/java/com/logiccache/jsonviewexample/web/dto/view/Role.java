package com.logiccache.jsonviewexample.web.dto.view;

public enum Role {
    PUBLIC("public"),
    ADMIN("admin"),
    PAYROLL("payroll"),
    PRIVATE("private");

    private String value;

    Role(String value) {
        this.value = value;
    }
}