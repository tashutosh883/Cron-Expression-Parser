package org.parser.CronSpecialCharacterParser;

import org.junit.Test;
import org.parser.models.CronElementType;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CommaConvertorTest {

    @Test
    public void parseCronFieldValue() {
        String cronExpressionOfField = "10,15";
        List<String> expectedValues = Arrays.asList("10", "15");
        assertTrue(new CommaConvertor().parseCronFieldValue(CronElementType.MINUTE, cronExpressionOfField).containsAll(expectedValues));
    }
}