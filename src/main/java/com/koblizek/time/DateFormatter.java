package com.koblizek.time;

import com.koblizek.time.util.Formatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class DateFormatter implements Formatter {
    private DateFormatter() {}

    public static String format(Formatting.FormattedTime[] formats) {
        List<Formatting.FormattedTime> dates = Arrays.stream(formats)
                .filter(a -> a.getTimeType() == Formatting.FormattedTime.TimeType.DATE).toList();
        StringBuilder builder = new StringBuilder();
        for (Formatting.FormattedTime date : dates) {
            builder.append(date.getStr())
                    .append(".");
        }
        builder.deleteCharAt(builder.length()-1);
        return LocalDate.now()
                .format(DateTimeFormatter.ofPattern(
                        builder.toString()
                ));
    }
}
