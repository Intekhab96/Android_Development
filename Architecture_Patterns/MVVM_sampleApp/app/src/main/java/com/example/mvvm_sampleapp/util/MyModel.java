package com.example.mvvm_sampleapp.util;

public class MyModel {
    String appName;
    long appDownloads;
    double appRatings;

    public MyModel(String appName, long appDownloads, double appRatings) {
        this.appName = appName;
        this.appDownloads = appDownloads;
        this.appRatings = appRatings;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public long getAppDownloads() {
        return appDownloads;
    }

    public void setAppDownloads(long appDownloads) {
        this.appDownloads = appDownloads;
    }

    public double getAppRatings() {
        return appRatings;
    }

    public void setAppRatings(double appRatings) {
        this.appRatings = appRatings;
    }
}
