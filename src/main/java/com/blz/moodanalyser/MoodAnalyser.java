package com.blz.moodanalyser;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this .message = message;
    }

    public String analyseMood() {
        try {
            if (message.contains("I am in Sad Mood")) {
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        }catch(NullPointerException e) {
            return "HAPPY";
        }
    }
}
