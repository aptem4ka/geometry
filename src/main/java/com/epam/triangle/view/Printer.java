package com.epam.triangle.view;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Printer {
    private static Logger logger=LogManager.getRootLogger();

    public static void print(String message)
    {logger.info(message);}

    public static void printError(String message)
    {
        logger.error(message);
    }
}
