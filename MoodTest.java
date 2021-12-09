package com.moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MoodTest {

	@Test
	public void moodSad() throws MoodAnalysisException {
		MoodAnalyzer call = new MoodAnalyzer("I am in sad Mood ");
		assertEquals("SAD", call.analyseMood());
	}

	@Test
	public void moodHappy() throws MoodAnalysisException {
		MoodAnalyzer call = new MoodAnalyzer("I am in happy mood");
		assertEquals("HAPPY", call.analyseMood());
	}

	@Test(expected = MoodAnalysisException.class)
	public void moodNull() throws MoodAnalysisException {
		MoodAnalyzer call = new MoodAnalyzer();
		call.analyseMood();
	}
	
	@Test(expected = MoodAnalysisException.class)
	public void moodEmpty() throws MoodAnalysisException{
		MoodAnalyzer call = new MoodAnalyzer();
		call.analyseMood();
	}
}
