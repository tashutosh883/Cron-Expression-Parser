package org.parser.CronSpecialCharacterParser;

import org.parser.models.CronElementType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaConvertor implements CronSpecialCharacterParser {

    @Override
    public List<String> parseCronFieldValue(CronElementType cronElementType, String cronFieldExpression) {
        String[] values = cronFieldExpression.split(",");
        return Arrays.stream(values).collect(Collectors.toList());
    }
}
