package jsch.example;

import org.apache.log4j.Level;

import com.jcraft.jsch.Logger;

public class MyLogger implements Logger {

	private static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(MyLogger.class);

	public boolean isEnabled(int level) {
		return true;
	}

	public void log(int level, String message) {
		LOGGER.log(Level.ERROR, message);
	}

}
