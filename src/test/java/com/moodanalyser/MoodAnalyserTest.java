package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void given_Message_When_Sad_Should_Return_Sad() {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String mood = moodAnalyser.AnalyseMood("This is a Sad Message");
        Assertions.assertEquals("Sad", mood);
    }

    @Test
    public void given_Message_When_Null_Should_Return_Happy() {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String mood = moodAnalyser.AnalyseNull(null);
        Assertions.assertEquals("Happy", mood);
    }

    @Test
    public void given_Message_When_Null(){
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String mood = moodAnalyser.analyseCustomException(null);
            Assertions.assertEquals("Happy", mood);
        }catch (MoodException e){
            Assertions.assertEquals("enter valid entry",e.getMessage());
//            e.printStackTrace();
        }
    }
}
