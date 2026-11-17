package com.example.addition.model;

public class AdditionResponse {
    private String message;
    private int status;
    private String operation;
    private int result;

    public AdditionResponse() {}

    public AdditionResponse(String message, int status, String operation, int result) {
        this.message = message;
        this.status = status;
        this.operation = operation;
        this.result = result;
    }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }

    public String getOperation() { return operation; }
    public void setOperation(String operation) { this.operation = operation; }

    public int getResult() { return result; }
    public void setResult(int result) { this.result = result; }
}
