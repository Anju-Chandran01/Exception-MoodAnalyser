package com.blz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    //sad mood test case
    @Test
    public void givingSadMessage_returnSadMood(){
        MoodAnalyser analyser=new MoodAnalyser();
        String mood=analyser.analyseMood("This is sad message");
        Assertions.assertEquals("SAD",mood );
    }

    //happy mood testcase
    @Test
    public void givingHappyMessage() {
        MoodAnalyser analyser = new MoodAnalyser();
        String mood = analyser.analyseMood("Iam in any mood");
        Assertions.assertEquals("HAPPY", mood);
    }
}
