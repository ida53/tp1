

package com.appfactory.tp1;
import org.joda.time.DateTime;

/**
 * My main Application
 * @author Ida
 * 
 */
public class Application{
	
	/** State of application. (true if running). */
	public static boolean isRunning = false;
	
	/***
	 * Entry point of application.
	 * @param args Argument from CLI.
	 */
	public static void main(final String[] args){
		
		
		final DateTime date = DateTime.now();
		
		System.out.println("coucou!!!! "+date);
		
	}

	/***
	 * Add two values.
	 * @param i first value.
	 * @param j second value.
	 * @return result of addition.
	 */
	public static int add(final int iii, final int jjj) {
		// TODO Auto-generated method stub
		return iii+jjj;
	}
}