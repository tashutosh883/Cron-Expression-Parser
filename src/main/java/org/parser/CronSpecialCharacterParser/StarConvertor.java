package org.parser.CronSpecialCharacterParser;

import org.parser.models.CronElementType;

import java.util.ArrayList;
import java.util.List;

public class StarConvertor implements CronSpecialCharacterParser {

    @Override
    public List<String> parseCronFieldValue(CronElementType cronElementType, String cronFieldExpression) {
        int start = cronElementType.getStartRange();
        int end = cronElementType.getEndRange();
        List<String> valueResult = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            valueResult.add(String.valueOf(i));
        }
        return valueResult;
    }
}
