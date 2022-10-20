package org.parser.CronSpecialCharacterParser;

import org.parser.models.CronElementType;

import java.util.ArrayList;
import java.util.List;

public class DashConvertor implements CronSpecialCharacterParser {

    @Override
    public List<String> parseCronFieldValue(CronElementType cronElementType, String cronFieldExpression) {
        List<String> valueResult = new ArrayList<>();
        String[] parts = cronFieldExpression.split("-");
        int start = Integer.parseInt(parts[0]);
        int end = Integer.parseInt(parts[1]);
        for (int i = start; i <= end; i++) {
            valueResult.add(String.valueOf(i));
        }
        return valueResult;
    }
}
