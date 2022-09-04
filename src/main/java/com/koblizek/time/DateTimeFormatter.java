package com.koblizek.time;

import com.koblizek.time.util.Formatter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class DateTimeFormatter implements Formatter {
    private DateTimeFormatter() {}

    public static String format(Formatting.FormattedTime[] formats) {
        List<Formatting.FormattedTime> dates = Arrays.stream(formats)
                .filter(a -> a.getTimeType() == Formatting.FormattedTime.TimeType.DATE).toList();
        List<Formatting.FormattedTime> times = Arrays.stream(formats)
                .filter(b -> b.getTimeType() == Formatting.FormattedTime.TimeType.TIME).toList();
        StringBuilder builder = new StringBuilder();
        for (Formatting.FormattedTime time : times) {
            builder.append(time.getStr())
                    .append(":");
        }
        builder.deleteCharAt(builder.length()-1);
        builder.append(" ");
        for (Formatting.FormattedTime date : dates) {
            builder.append(date.getStr())
                    .append(".");
        }
        builder.deleteCharAt(builder.length()-1);
        return LocalDate.now()
                .format(java.time.format.DateTimeFormatter.ofPattern(
                        builder.toString()
                ));
    }
}
