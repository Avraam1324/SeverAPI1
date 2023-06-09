package com.example.severapi;

public class TimeResponse {

    private String currentTime;
    private String clientIp;

    public TimeResponse(String currentTime, String clientIp) {
        this.currentTime = currentTime;
        this.clientIp = clientIp;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public String getClientIp() {
        return clientIp;
    }
}

