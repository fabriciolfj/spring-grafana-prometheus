package com.github.fabriciolfj.simple.controller;

public class ExampleDTO {

    private String name;

    public ExampleDTO(final String name) {
        this.name = name;
    }

    public ExampleDTO() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
