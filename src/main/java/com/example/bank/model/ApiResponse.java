package com.example.bank.model;

import java.util.List;

public class ApiResponse {
    private int status;
    private String message;
    private List<OperationRecord> data;

    public ApiResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public ApiResponse(int status, String message, List<OperationRecord> data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() { return status; }
    public String getMessage() { return message; }
    public List<OperationRecord> getData() { return data; }
}
