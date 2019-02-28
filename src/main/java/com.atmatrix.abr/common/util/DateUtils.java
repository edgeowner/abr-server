package com.atmatrix.abr.common.util;

import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.util.StringUtils;


@Slf4j
public class DateUtils {


    public static String getDefaultPattern() {
        return "yyyy-MM-dd HH:mm:ss";
    }

    public static DateTime parseDateToString(String date, String pattern) {
        DateTime result = null;
        String defaultStr = getDefaultPattern();
        defaultStr = StringUtils.isEmpty(pattern) ? defaultStr : pattern;
        DateTimeFormatter formatter = DateTimeFormat.forPattern(defaultStr);
        if (!StringUtils.isEmpty(date)) {
            result = formatter.parseDateTime(date);
        }
        return result;
    }


}
