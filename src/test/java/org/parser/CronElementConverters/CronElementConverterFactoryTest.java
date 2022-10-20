package org.parser.CronElementConverters;

import org.junit.Test;
import org.parser.exceptions.NoSuchElementConvertorException;
import org.parser.models.CronElementType;


import static org.junit.Assert.*;

public class CronElementConverterFactoryTest {

    @Test
    public void getConvertor() throws NoSuchElementConvertorException {
        assertEquals(CronElementConverterFactory.getConvertor(CronElementType.MINUTE).getClass(), CronMinuteConvertor.class);
        assertEquals(CronElementConverterFactory.getConvertor(CronElementType.COMMAND).getClass(), CronCommandConvertor.class);
        assertEquals(CronElementConverterFactory.getConvertor(CronElementType.DAY_OF_MONTH).getClass(), CronDayOfMonthConvertor.class);
        assertEquals(CronElementConverterFactory.getConvertor(CronElementType.DAY_OF_WEEK).getClass(), CronDayOfWeekConvertor.class);
        assertEquals(CronElementConverterFactory.getConvertor(CronElementType.HOUR).getClass(), CronHourConvertor.class);
        assertEquals(CronElementConverterFactory.getConvertor(CronElementType.MONTH).getClass(), CronMonthConvertor.class);
    }

}