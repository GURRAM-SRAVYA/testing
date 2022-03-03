package Day_x;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J {
	private static final Logger log=LogManager.getLogger(Log4J.class);

	public static void main(String[] args) {
		log.debug("This is my debug message");
		log.info("This is my info message");
		log.warn("This is my warn message");
		log.error("This is my error message");
		log.fatal("This is my fatal message");
		
		

	}

}
