package com.moodanalyser;

public class MoodAnalyser {
    public void PrintWelcomeMessage() {
        System.out.println("Welcome to the Mood Analyser Problem");
    }

    public String AnalyseMood(String message) throws MoodException {
        try {
            if(message.length() == 0)
                throw new MoodException(MoodException.ExceptionType.ENTERED_EMPTY,"Enter Non-Empty Mood");
            if(message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch(NullPointerException e) {
            throw new MoodException(MoodException.ExceptionType.ENTERED_NULL,"Enter the Proper Mood");
        } catch(IllegalArgumentException e) {
            throw new MoodException(MoodException.ExceptionType.ENTERED_NULL,"Enter the Proper Mood");
        }
    }
}
