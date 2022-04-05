package com.blz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void givenSadWhileAnalysisMoodShouldReturnSad() {
        MoodAnalyser MoodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String result = MoodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", result);
    }

    @Test
    public void givenHappyWhileAnalysisMoodShouldReturnHappy() {
        MoodAnalyser MoodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String result = MoodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", result);
    }

    @Test
    public void givenNullWhileAnalysisMoodShouldReturnHappy() {
        MoodAnalyser MoodAnalyser = new MoodAnalyser(null);
        String result = MoodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", result);
    }
}
