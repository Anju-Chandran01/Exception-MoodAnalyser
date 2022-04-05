package com.blz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenSadWhileAnalysisMoodShouldReturnSad() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Sad Mood");
        try {
            Assertions.assertEquals("SAD",moodAnalyzer.analyseMood());
        } catch (MoodAnalyzerException e) {
        }
    }

    @Test
    public void givenHappyWhileAnalysisMoodShouldReturnHappy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Happy Mood");
        try {
            Assertions.assertEquals("HAPPY",moodAnalyzer.analyseMood());
        } catch (MoodAnalyzerException e) {
        }
    }

    @Test
    public void givenNullWhileAnalysisMoodShouldReturnHappy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalyzerException e) {
            Assertions.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL, e.getType());
        }
    }

    @Test
    public void givenEmptyWhileAnalysisMoodShouldReturnHappy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("");
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalyzerException e) {
            Assertions.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, e.getType());
        }
    }
}
