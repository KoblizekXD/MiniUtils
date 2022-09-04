package com.koblizek.time;

import com.koblizek.time.util.Formatter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public final class TimeFormatter implements Formatter {
    private TimeFormatter() {}

    public static String format(Formatting.FormattedTime[] formats) {
        List<Formatting.FormattedTime> times = Arrays.stream(formats)
                .filter(a -> a.getTimeType() == Formatting.FormattedTime.TimeType.TIME).toList();
        StringBuilder builder = new StringBuilder();
        for (Formatting.FormattedTime time : times) {
            builder.append(time.getStr())
                    .append(":");
        }
        builder.deleteCharAt(builder.length()-1);
        return LocalTime.now()
                .format(DateTimeFormatter.ofPattern(
                        builder.toString()
                ));
    }
}
