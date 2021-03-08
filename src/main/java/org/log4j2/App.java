package org.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        logger.info("Hello from logger info level");
        logger.debug("Hello from logger debug level");
        logger.trace("Hello from logger trace level");

    }
}
