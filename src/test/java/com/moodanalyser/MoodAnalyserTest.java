package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void print_Welcome_Message() {
        MoodAnalyser mood = new MoodAnalyser();
        mood.PrintWelcomeMessage();
    }
    @Test
    public void Given_Message_When_Sad_Should_Return_Sad() {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.AnalyseMood("This is a Sad Message");
            Assertions.assertEquals("SAD", mood);
        } catch (MoodException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Given_Message_When_Happy_Should_Return_Happy() {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.AnalyseMood("This is a Happy Message");
            Assertions.assertEquals("HAPPY", mood);
        } catch (MoodException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Given_Message_When_Null_Should_throw_Exception() {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.AnalyseMood(null);
        } catch (MoodException e) {
            Assertions.assertEquals(MoodException.ExceptionType.ENTERED_NULL, e.type );
            Assertions.assertEquals("Enter the Proper Mood", e.getMessage());
        }
    }

    @Test
    public void Given_Message_When_Empty_Should_throw_Exception() {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.AnalyseMood("");
        } catch (MoodException e) {
            Assertions.assertEquals(MoodException.ExceptionType.ENTERED_EMPTY, e.type );
            Assertions.assertEquals("Enter Non-Empty Mood", e.getMessage());
        }

    }


}
