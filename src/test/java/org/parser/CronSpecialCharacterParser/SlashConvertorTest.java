package org.parser.CronSpecialCharacterParser;

import org.junit.Test;
import org.parser.models.CronElementType;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SlashConvertorTest {

    @Test
    public void parseCronFieldValue()  {
        String cronExpressionOfField = "10/40/10";
        List<String> expectedValues = Arrays.asList("10","20","30","40");
        assertTrue(new SlashConvertor().parseCronFieldValue(CronElementType.MINUTE, cronExpressionOfField).containsAll(expectedValues));
    }
}