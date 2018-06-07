package com.appfactory.tp1;
import org.joda.time.DateTime;

/**
 * My main Application.
 * @author Ida
 */
public final class Application {
    /**
     * Contructeur.
     */
    private Application() {
        super();
    }

/***
 * Entry point of application.
 * @param args Argument from CLI.
 */
public static void main(final String[] args) {
    final DateTime date = DateTime.now();
    System.out.println("coucou!!!! " + date);
}


/***
 * Add two values.
 * @param iii first value.
 * @param jjj second value.
 * @return result of addition.
 */
public static int add(final int iii, final int jjj) {
    // TODO Auto-generated method stub
        return iii + jjj;
    }
}
