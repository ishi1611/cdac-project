package com.crs.dto;

public class ApiResponse {
    public boolean flag;
    public String message;

    public ApiResponse() {
        flag = false;
        message = "";
    }

    public ApiResponse(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

}
