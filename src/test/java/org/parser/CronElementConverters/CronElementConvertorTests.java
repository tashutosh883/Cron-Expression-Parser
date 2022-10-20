package org.parser.CronElementConverters;

import org.junit.Test;
import org.parser.Constants;
import org.parser.exceptions.NoSuchSpecialCharPatternException;

import static org.junit.Assert.assertEquals;

public class CronElementConvertorTests {

    @Test
    public void testCronElementConversions() throws NoSuchSpecialCharPatternException {
//        */15 0 1,15 * 1-5 /usr/bin/find
//        minute 0 15 30 45
//        hour 0
//        day of month 1 15
//        month 1 2 3 4 5 6 7 8 9 10 11 12
//        day of week 2 3 4 5
//        command /usr/bin/find
        String expectedMinute = String.format(Constants.FORMATTER, "minute", "0 15 30 45");
        String expectedHour = String.format(Constants.FORMATTER, "hour" , "0");
        String expectedDayOfMonth = String.format(Constants.FORMATTER, "day of month", "1 15");
        String expectedMonth = String.format(Constants.FORMATTER, "month", "1 2 3 4 5 6 7 8 9 10 11 12");
        String expectedDayOfWeek = String.format(Constants.FORMATTER, "day of week", "1 2 3 4 5");
        String expectedCommand = String.format(Constants.FORMATTER, "command", "/usr/bin/find");
        assertEquals(new CronMinuteConvertor().convert("*/15"), expectedMinute);
        assertEquals(new CronHourConvertor().convert("0"), expectedHour);
        assertEquals(new CronDayOfMonthConvertor().convert("1,15"), expectedDayOfMonth);
        assertEquals(new CronMonthConvertor().convert("*"), expectedMonth);
        assertEquals(new CronDayOfWeekConvertor().convert("1-5"), expectedDayOfWeek);
        assertEquals(new CronCommandConvertor().convert("/usr/bin/find"), expectedCommand);

    }
}
