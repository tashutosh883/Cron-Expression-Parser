package org.parser.CronSpecialCharacterParser;

import org.parser.models.CronElementType;

import java.util.Collections;
import java.util.List;

public class SingleElementConvertor implements CronSpecialCharacterParser {
    @Override
    public List<String> parseCronFieldValue(CronElementType cronElementType, String cronFieldExpression) {
        return Collections.singletonList(cronFieldExpression);
    }
}
