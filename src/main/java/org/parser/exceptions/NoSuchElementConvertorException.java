package org.parser.exceptions;

public class NoSuchElementConvertorException extends ParserExceptions{
    public NoSuchElementConvertorException(String elemType) {
        super(String.format("Cron Element convertor for type: %s is not implemented yet", elemType));
    }
}
