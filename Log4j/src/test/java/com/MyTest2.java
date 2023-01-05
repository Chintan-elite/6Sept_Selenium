package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyTest2 {
	
	private static final Logger log = LogManager.getLogger(MyTest2.class);
	public static void main(String[] args) {
		
		
		log.debug("this is my debug message");
		log.info("This is my info msg");
		log.error("this is my error message");
		log.fatal("this is fatal msg");
	}
}
