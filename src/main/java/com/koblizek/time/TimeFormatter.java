package com.koblizek.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public final class TimeFormatter {
    private TimeFormatter() {}

    public static String format(Formatting.FormattedTime[] formats) {
        List<Formatting.FormattedTime> times = Arrays.stream(formats)
                .filter(a -> a.getTimeType() == Formatting.FormattedTime.TimeType.TIME).toList();
        StringBuilder builder = new StringBuilder();
        for (Formatting.FormattedTime time : times) {
            builder.append(time.getStr());
        }
        return LocalDate.now()
                .format(DateTimeFormatter.ofPattern(
                        builder.toString()
                ));
    }
}
