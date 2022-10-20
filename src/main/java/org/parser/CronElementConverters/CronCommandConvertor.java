package org.parser.CronElementConverters;

import org.parser.Constants;
import org.parser.models.CronElementType;

public class CronCommandConvertor extends CronElementConvertor {
    public CronCommandConvertor() {
        super(CronElementType.COMMAND);
    }

    public String convert(String cronElementExpression) {
        return String.format(Constants.FORMATTER, CronElementType.COMMAND.getDisplayName(), cronElementExpression);
    }
}
