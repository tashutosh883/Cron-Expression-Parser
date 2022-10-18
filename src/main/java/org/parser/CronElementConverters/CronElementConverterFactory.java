package org.parser.CronElementConverters;

import org.parser.exceptions.NoSuchElementConvertorException;
import org.parser.models.CronElementType;

public class CronElementConverterFactory {
    public static CronElementConvertor getConvertor(CronElementType cronElementType) throws NoSuchElementConvertorException {
        switch (cronElementType) {
            case HOUR:
                return new CronHourConvertor();
            case MONTH:
                return new CronMonthConvertor();
            case MINUTE:
                return new CronMinuteConvertor();
            case COMMAND:
                return new CronCommandConvertor();
            case DAY_OF_WEEK:
                return new CronDayOfWeekConvertor();
            case DAY_OF_MONTH:
                return new CronDayOfMonthConvertor();
        }
        throw new NoSuchElementConvertorException(cronElementType.name());
    }
}
