package org.parser.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.parser.exceptions.NoSuchElementPositionException;


@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public enum CronElementType {
    MINUTE("minute", 0, 0, 59),
    HOUR("hour", 1, 0, 23),
    DAY_OF_MONTH("day of month", 2, 1, 31),
    MONTH("month", 3, 1, 12),
    DAY_OF_WEEK("day of week", 4, 1, 7),
    COMMAND("command", 5);
    private final String displayName;
    private final int positionInCronExpression;
    private int startRange;
    private int endRange;

    public static CronElementType getCronElemTypeByPosition(int positionInCronExpression) throws NoSuchElementPositionException {
        for (CronElementType cronElementType :
                CronElementType.values()) {
            if (cronElementType.getPositionInCronExpression() == positionInCronExpression) {
                return cronElementType;
            }
        }
        throw new NoSuchElementPositionException(positionInCronExpression);
    }
}
