package com.eguevara.sandbox;

import org.apache.log4j.Logger;

/**
 * Testing logging using org.apache.log4j.Logger
 *
 * sending outpput to stdout and file using log4j.properties file under /resources
 *
 * Created by erickguevara on 10/21/14.
 */
public class LoggingApacheTest {


    private static final Logger LOG = Logger.getLogger(LoggingApacheTest.class.getName());
//    static Logger log = Logger.getLogger(LoggingTest.class.getName());

    public static void main(String[] args) {

        LOG.info("testing log.info");
        LOG.debug("testing log.debug");
        LOG.warn("testing log.warn");
        LOG.fatal("testing log.fatal");
    }
}
