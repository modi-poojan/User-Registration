package com.moodanalyzer;

public class MoodAnalysisException extends Exception {

	public String message;
	public ExceptionTypes type;

	public MoodAnalysisException() {

	}

	public MoodAnalysisException(String message) {
		super(message);
		this.message = message;
	}

	public MoodAnalysisException(String message, ExceptionTypes type) {
		super(message);
		this.message = message;
		this.type = type;
	}

}
