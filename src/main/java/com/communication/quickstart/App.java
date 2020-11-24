package com.communication.quickstart;

import java.time.LocalDate;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App
{
	//private static Logger logger = LogManager.getLogger( App.class );

	static final Logger log = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        //BasicConfigurator.configure();
        //logger.debug( "Entering the main class" );

    	BasicConfigurator.configure();

    	LocalDate localDate = LocalDate.now();

    	log.info("현재년월 : " + localDate);

    	log.info("현재년도" + localDate.getYear());
    	log.info("현재월 : " + localDate.getMonth());
    	log.info("현재월 : " + localDate.getMonthValue());
    }
}
