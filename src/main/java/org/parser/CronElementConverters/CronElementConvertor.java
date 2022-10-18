package org.parser.CronElementConverters;

import org.parser.CronSpecialCharacterParser.CronSpecialCharactersParserFactory;
import org.parser.exceptions.NoSuchSpecialCharPatternException;
import org.parser.models.CronElementType;

public abstract class CronElementConvertor {
    private final CronElementType cronElementType;
    public CronElementConvertor(CronElementType cronElementType){
        this.cronElementType= cronElementType;
    }
    public String convert(String cronElementExpression) throws NoSuchSpecialCharPatternException {
        return cronElementType.getDisplayName() + "\t" + String.join(",",CronSpecialCharactersParserFactory.getParser(cronElementExpression).parseCronFieldValue(cronElementType, cronElementExpression));
    }
}
