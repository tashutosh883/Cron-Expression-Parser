package org.parser.CronElementConverters;

import org.parser.models.CronElementType;

public class CronCommandConvertor extends CronElementConvertor {
    public CronCommandConvertor() {
        super(CronElementType.COMMAND);
    }

    public String convert(String cronElementExpression){
        return CronElementType.COMMAND.getDisplayName() + "\t" + cronElementExpression;
    }
}
