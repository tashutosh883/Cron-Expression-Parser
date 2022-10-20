package org.parser.CronSpecialCharacterParser;

import org.junit.Test;
import org.parser.models.CronElementType;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StarSlashConvertorTest {

    @Test
    public void parseCronFieldValue()  {
        String cronExpressionOfField = "*/10";
        List<String> expectedValues = Arrays.asList("0","10","20","30","40","50");
        assertTrue(new StarConvertor().parseCronFieldValue(CronElementType.MINUTE, cronExpressionOfField).containsAll(expectedValues));
    }
}