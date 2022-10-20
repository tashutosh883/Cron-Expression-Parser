package org.parser.exceptions;

public class NoSuchSpecialCharPatternException extends ParserExceptions {
    public NoSuchSpecialCharPatternException(String cronFieldStr) {
        super(String.format("Special character Pattern is not implemented yet for %s", cronFieldStr));
    }
}
