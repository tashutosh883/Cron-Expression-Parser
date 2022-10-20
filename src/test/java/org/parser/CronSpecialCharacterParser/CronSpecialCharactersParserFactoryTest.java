package org.parser.CronSpecialCharacterParser;

import org.junit.Test;
import org.parser.exceptions.NoSuchSpecialCharPatternException;

import static org.junit.Assert.*;

public class CronSpecialCharactersParserFactoryTest {

    @Test
    public void getParser() throws NoSuchSpecialCharPatternException {
        assertEquals(CronSpecialCharactersParserFactory.getParser("10,20").getClass(), CommaConvertor.class);
        assertEquals(CronSpecialCharactersParserFactory.getParser("10-20").getClass(), DashConvertor.class);
        assertEquals(CronSpecialCharactersParserFactory.getParser("10").getClass(), SingleElementConvertor.class);
        assertEquals(CronSpecialCharactersParserFactory.getParser("10/20/3").getClass(), SlashConvertor.class);
        assertEquals(CronSpecialCharactersParserFactory.getParser("*").getClass(), StarConvertor.class);
        assertEquals(CronSpecialCharactersParserFactory.getParser("*/10").getClass(), StarSlashConvertor.class);
    }
}