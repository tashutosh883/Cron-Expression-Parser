package org.parser.cron_parsers;


import org.parser.CronElementConverters.CronElementConverterFactory;
import org.parser.exceptions.NoSuchElementConvertorException;
import org.parser.exceptions.NoSuchElementPositionException;
import org.parser.exceptions.NoSuchSpecialCharPatternException;
import org.parser.models.CronElementType;

import java.util.ArrayList;
import java.util.List;

public class CLICronParser implements CronParser {

    @Override
    public String parse(String expression) {
        String[] exprParts = expression.split(" ", 6);
        List<String> humanReadableCronPart = new ArrayList<>();
        for (int i = 0; i < exprParts.length; i++) {
            try {
                humanReadableCronPart.add(convertToHumanReadableText(exprParts[i], i));
            } catch (NoSuchSpecialCharPatternException | NoSuchElementPositionException |
                     NoSuchElementConvertorException e) {
                throw new RuntimeException(e.getErrorString());
            }
        }
        return String.join("\n", humanReadableCronPart);
    }

    private String convertToHumanReadableText(String cronExpressionOfField, int positionInCronExpression) throws NoSuchSpecialCharPatternException, NoSuchElementPositionException, NoSuchElementConvertorException {
        CronElementType cronElementType = CronElementType.getCronElemTypeByPosition(positionInCronExpression);
        return CronElementConverterFactory.getConvertor(cronElementType).convert(cronExpressionOfField);
    }
}
