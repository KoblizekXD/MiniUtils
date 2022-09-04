package com.koblizek.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class DateFormatter {
    private DateFormatter() {}

    public static String format(Formatting.FormattedTime[] formats) {
        List<Formatting.FormattedTime> dates = Arrays.stream(formats)
                .filter(a -> a.getTimeType() == Formatting.FormattedTime.TimeType.DATE).toList();
        StringBuilder builder = new StringBuilder();
        for (Formatting.FormattedTime date : dates) {
            builder.append(date.getStr());
        }
        return LocalDate.now()
                .format(DateTimeFormatter.ofPattern(
                        builder.toString()
                ));
    }
}
