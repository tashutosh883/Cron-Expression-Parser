package org.parser.CronSpecialCharacterParser;

import org.parser.models.CronElementType;

import java.util.ArrayList;
import java.util.List;

public class StarSlashConvertor implements CronSpecialCharacterParser {

    @Override
    public List<String> parseCronFieldValue(CronElementType cronElementType, String cronFieldExpression) {
        int start = cronElementType.getStartRange();
        int end = cronElementType.getEndRange();
        int mod = Integer.parseInt(cronFieldExpression.split("/")[1]);
        List<String> valueResult = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (i % mod == 0) {
                valueResult.add(String.valueOf(i));
            }
        }
        return valueResult;
    }
}
