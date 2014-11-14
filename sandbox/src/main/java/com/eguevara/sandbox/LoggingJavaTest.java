package com.eguevara.sandbox;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by erickguevara on 10/22/14.
 */
public class LoggingJavaTest {


    public static final Logger LOG = Logger.getLogger(LoggingJavaTest.class.getName());

    public static void main(String[] args) {

        loggerTest();

    }

    public static void loggerTest() {

        LOG.entering(LoggingJavaTest.class.getName(), "LoggerTest() - Enter");

        System.out.println("LoggerTEst");
        LOG.log(Level.WARNING, "Error doing XYZ");
        LOG.log(Level.INFO, "Error doing XYZ");
        LOG.log(Level.FINE, "Error doing XYZ");
        LOG.log(Level.FINER, "Error doing XYZ");
        LOG.log(Level.SEVERE, "Error doing XYZ");


        LOG.exiting(LoggingJavaTest.class.getName(), "LoggerTest() - Exiting");

    }
}
