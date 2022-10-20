package org.parser.exceptions;

import lombok.Getter;

@Getter
public class ParserExceptions extends Exception {
    private String errorString;

    public ParserExceptions(String errorString) {
        super(errorString);
        this.errorString = errorString;
    }
}
