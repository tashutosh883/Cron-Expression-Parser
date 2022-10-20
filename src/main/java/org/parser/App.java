package org.parser;

import org.parser.cron_parsers.CLICronParser;


/**
 * Cron Expression Parser
 */
public class App {
    public static void main(String[] args) {
        System.out.println(new CLICronParser().parse(args[0]));
    }
}
