package com.moodanalyser;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if(message.contains("Sad"))
            return "SAD";
        String happy = "HAPPY";
        return happy;
    }
}