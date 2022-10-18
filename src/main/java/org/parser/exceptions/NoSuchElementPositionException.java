package org.parser.exceptions;

public class NoSuchElementPositionException extends ParserExceptions{
    public NoSuchElementPositionException(int positionInCronExpression) {
        super(String.format("%s position is not invalid in a cron expression!", positionInCronExpression));
    }
}
