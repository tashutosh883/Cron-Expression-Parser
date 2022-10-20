package org.parser.CronSpecialCharacterParser;

import org.junit.Test;
import org.parser.models.CronElementType;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StarConvertorTest {

    @Test
    public void parseCronFieldValue()  {
        String cronExpressionOfField = "*";
        List<String> expectedValues = Arrays.asList("1","2","3","4","5","6","7");
        assertTrue(new StarConvertor().parseCronFieldValue(CronElementType.DAY_OF_WEEK, cronExpressionOfField).containsAll(expectedValues));
    }
}