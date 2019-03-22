package com.singleton;

public class TestLogger {

	public static void main(String[] args) {

		Logger logger = Logger.getInstance();
		Logger logger1 = Logger.getInstance();
		
		System.out.println(logger.hashCode());
		System.out.println(logger1.hashCode());
	}

}
