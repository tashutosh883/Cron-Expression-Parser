package org.parser.CronSpecialCharacterParser;

import org.parser.models.CronElementType;

import java.util.ArrayList;
import java.util.List;

public class SlashConvertor implements CronSpecialCharacterParser {
    @Override
    public List<String> parseCronFieldValue(CronElementType cronElementType, String cronFieldExpression) {
        String[] parts = cronFieldExpression.split("/");
        int start = Integer.parseInt(parts[0]);
        int end = Integer.parseInt(parts[1]);
        int step = Integer.parseInt(parts[2]);
        List<String> valueResult = new ArrayList<>();
        for(int i=start;i<= end; i+=step){
            valueResult.add(String.valueOf(i));
        }
        return valueResult;
    }
}
