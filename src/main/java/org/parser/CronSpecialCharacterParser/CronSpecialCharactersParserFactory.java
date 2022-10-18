package org.parser.CronSpecialCharacterParser;

import org.parser.Constants;
import org.parser.exceptions.NoSuchSpecialCharPatternException;

public class CronSpecialCharactersParserFactory {
    public static CronSpecialCharacterParser getParser(String cronFieldStr) throws NoSuchSpecialCharPatternException {
         if (isStarSlashType(cronFieldStr)) {
            return new StarSlashConvertor();
        }
        if (isCommaType(cronFieldStr)) {
            return new CommaConvertor();
        }

        if (isStarType(cronFieldStr)) {
            return new StarConvertor();
        }
        if (isDashType(cronFieldStr)) {
            return new DashConvertor();
        }
        if (isSlashType(cronFieldStr)) {
            return new SlashConvertor();
        }
        if(isSingleElementType(cronFieldStr)){
            return new SingleElementConvertor();

        }
        throw new NoSuchSpecialCharPatternException(cronFieldStr);
    }

    private static boolean isSingleElementType(String cronFieldStr) {
        return false;
    }

    private static boolean isSlashType(String cronFieldStr) {
        return cronFieldStr.contains(Constants.SLASH);
    }

    private static boolean isDashType(String cronFieldStr) {
        return cronFieldStr.contains(Constants.DASH);
    }

    private static boolean isStarSlashType(String cronFieldStr) {
        return cronFieldStr.contains(Constants.STAR) && cronFieldStr.contains(Constants.SLASH);
    }

    private static boolean isStarType(String cronFieldStr) {
        return cronFieldStr.contains(Constants.STAR);
    }

    private static boolean isCommaType(String cronFieldStr) {
        return cronFieldStr.contains(Constants.COMMA);
    }
}
