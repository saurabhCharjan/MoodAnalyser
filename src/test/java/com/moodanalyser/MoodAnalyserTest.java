package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void given_Message_When_Sad_Should_Return_Sad() {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String mood = moodAnalyser.AnalyseMood("This is a Happy Message");
        Assertions.assertEquals("HAPPY", mood);
    }
}
