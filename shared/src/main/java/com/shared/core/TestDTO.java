package com.shared.core;

public class TestDTO {
    private String name;

    public TestDTO() {
    }

    public String getName() {
        return name;
    }

    public TestDTO setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "TestDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
