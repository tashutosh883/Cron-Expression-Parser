package org.parser.CronSpecialCharacterParser;

import org.junit.Test;
import org.parser.models.CronElementType;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SingleElementConvertorTest {

    @Test
    public void parseCronFieldValue() {
        String cronExpressionOfField = "10";
        List<String> expectedValues = Collections.singletonList("10");
        assertTrue(new SingleElementConvertor().parseCronFieldValue(CronElementType.MINUTE, cronExpressionOfField).containsAll(expectedValues));
    }
}