package org.parser.cron_parsers;

import org.junit.Test;
import org.parser.Constants;

import static org.junit.Assert.*;

public class CLICronParserTest {

    @Test
    public void parse() {
        String expectedMinute = String.format(Constants.FORMATTER, "minute", "0 15 30 45");
        String expectedHour = String.format(Constants.FORMATTER, "hour" , "0");
        String expectedDayOfMonth = String.format(Constants.FORMATTER, "day of month", "1 15");
        String expectedMonth = String.format(Constants.FORMATTER, "month", "1 2 3 4 5 6 7 8 9 10 11 12");
        String expectedDayOfWeek = String.format(Constants.FORMATTER, "day of week", "1 2 3 4 5");
        String expectedCommand = String.format(Constants.FORMATTER, "command", "/usr/bin/find");
        assertEquals(expectedMinute + "\n" + expectedHour + "\n" + expectedDayOfMonth + "\n" + expectedMonth + "\n" + expectedDayOfWeek + "\n" + expectedCommand, new CLICronParser().parse("*/15 0 1,15 * 1-5 /usr/bin/find"));
    }
}