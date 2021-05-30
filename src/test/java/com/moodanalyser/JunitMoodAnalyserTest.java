package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitMoodAnalyserTest {

    @Test
    public void givenSadMessageShouldReturnsSad() {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String mood = moodAnalyser.analyseMood("Hello am Sad mood");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenHappyMessageShouldReturnsHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Hello am Happy mood");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenAnyMessageShouldReturnsHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Hello am Dash mood");
        Assertions.assertEquals("HAPPY", mood);
    }
}
