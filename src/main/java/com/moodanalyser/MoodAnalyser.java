package com.moodanalyser;

public class MoodAnalyser {
    public String AnalyseMood(String message) {
        if (message.contains("Sad")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }
    public String AnalyseNull(String message) {
        try {
            if (message.contains("Sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        }catch (NullPointerException e){
            return "Happy";
        }
    }
    public String analyseCustomException(String message) throws MoodException {
        try {
            if (message.contains("Sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        }catch(NullPointerException e){
        throw new MoodException("enter valid entry");
        }
    }
}
