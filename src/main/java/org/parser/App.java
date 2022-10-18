package org.parser;

import org.parser.cron_parsers.CLICronParser;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( new CLICronParser().parse(args[0]));
    }
}
