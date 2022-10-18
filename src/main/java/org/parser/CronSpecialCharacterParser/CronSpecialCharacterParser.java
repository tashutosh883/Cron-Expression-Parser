package org.parser.CronSpecialCharacterParser;

import org.parser.models.CronElementType;

import java.util.List;

public interface CronSpecialCharacterParser {
    List<String> parseCronFieldValue(CronElementType cronElementType, String cronFieldExpression);
}
