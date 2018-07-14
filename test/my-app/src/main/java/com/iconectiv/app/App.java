package com.iconectiv.app;

/**
 * Hello world first example completed!
 *
 */
import org.apache.log4j.Logger;
public class App
{
	final static Logger _logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	_logger.debug( "Hello Amit!" );
    	_logger.debug( "Welcome back Amit!" );
        _logger.debug(new Calculator().add(5,10));
        _logger.debug(new Calculator().subtract(15, 10));
        _logger.debug(new Calculator().multiply(5,10));
        _logger.debug(new Calculator().divide(50,10));
    }
}
