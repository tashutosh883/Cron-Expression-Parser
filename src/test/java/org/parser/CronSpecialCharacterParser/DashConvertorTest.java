package org.parser.CronSpecialCharacterParser;

import org.junit.Test;
import org.parser.models.CronElementType;

import java.util.*;

import static org.junit.Assert.*;

public class DashConvertorTest {

    @Test
    public void parseCronFieldValue() {
        String cronExpressionOfField = "10-15";
        List<String> expectedValues = Arrays.asList("10", "11", "12", "13", "14", "15");
        assertTrue(new DashConvertor().parseCronFieldValue(CronElementType.MINUTE, cronExpressionOfField).containsAll(expectedValues));
    }
}