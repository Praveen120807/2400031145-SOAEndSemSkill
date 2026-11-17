package com.example.addition.model;

public class AdditionRequest {
    private Integer a;
    private Integer b;

    public AdditionRequest() {}

    public AdditionRequest(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() { return a; }
    public void setA(Integer a) { this.a = a; }

    public Integer getB() { return b; }
    public void setB(Integer b) { this.b = b; }
}
