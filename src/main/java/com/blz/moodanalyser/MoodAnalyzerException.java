package com.blz.moodanalyser;

public class MoodAnalyzerException extends Exception{
    private static final long serialVersionUID = 1L;

    enum ExceptionType {ENTERED_NULL,ENTERED_EMPTY}
    ExceptionType type;

    public MoodAnalyzerException(String message) {
        super(message);
    }

    public MoodAnalyzerException(ExceptionType type,String message) {
        super(message);
        this.type=type;
    }
}
