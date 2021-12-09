package com.moodanalyzer;

public class MoodAnalyzer {

	private String message;

	public MoodAnalyzer() {

	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {

		if (this.message == null) {
			throw new MoodAnalysisException("Mood can't null", ExceptionTypes.NULL);
		} else if (this.message.isEmpty()) {
			throw new MoodAnalysisException("Mood can't be left empty", ExceptionTypes.EMPTY);
		} else if (this.message.contains("sad")) {
			return "SAD";
		} else
			return "HAPPY";
	}
}

//