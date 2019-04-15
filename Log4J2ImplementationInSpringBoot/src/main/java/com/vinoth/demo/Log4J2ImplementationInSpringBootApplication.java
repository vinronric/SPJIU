package com.vinoth.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class Log4J2ImplementationInSpringBootApplication {

	 private static final Logger logger = LogManager.getLogger(Log4J2ImplementationInSpringBootApplication.class);
		
		public static void main(String[] args) {
			SpringApplication.run(Log4J2ImplementationInSpringBootApplication.class, args);
			
			logger.debug("Debugging log");
	        logger.info("Info log");
	        logger.warn("Hey, This is a warning!");
	        logger.error("Oops! We have an Error. OK");
	        logger.fatal("Damn! Fatal error. Please fix me.");
		}

}
