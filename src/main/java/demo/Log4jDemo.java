package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {	
	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {

		System.out.println("hello world 1 \n");
		logger.info("This is info message");
		
		System.out.println("hello world 2 \n");
		logger.trace("This is trace message");
		
		System.out.println("hello world 3 \n");
		logger.error("This is error message");
		
		System.out.println("hello world 4 \n");
		logger.warn("This is warn message");
		
		System.out.println("hello world 5 \n");
		logger.fatal("This is fatal message");
		
		System.out.println("completed");

		
	}

}
