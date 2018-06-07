

package com.testFactory.tp1;
import org.joda.time.DateTime;

/**
 * My main Application
 * @author Ida
 * 
 */
public class Application{
	
	/** State of application. (true if running). */
	private static boolean isRunning = false;
	
	/***
	 * Entry point of application.
	 * @param args Argument from CLI.
	 */
	public static void main(String[] args){
		
		
		final DateTime date = DateTime.now();
		
		System.out.println("coucou!!!! "+date);
		
	}

	/***
	 * Add two values.
	 * @param i first value.
	 * @param j second value.
	 * @return result of addition.
	 */
	public static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
}