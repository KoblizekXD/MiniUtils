package com.koblizek.time;

public final class Formatting {
    public static class FormattedTime {
        private final String str;
        private final TimeType timeType;

        public enum TimeType {
            DATE,
            TIME
        }
        public FormattedTime(String str, TimeType timeType) {
            this.str = str;
            this.timeType = timeType;
        }
        public String getStr() {
            return str;
        }
        public TimeType getTimeType() {
            return timeType;
        }
    }
    private Formatting() {}

    public static FormattedTime DAY(int count) {
        return new FormattedTime("d".repeat(count), FormattedTime.TimeType.DATE);
    }
    public static FormattedTime MONTH(int count) {
        return new FormattedTime("M".repeat(count), FormattedTime.TimeType.DATE);
    }
    public static FormattedTime YEAR(int count) {
        return new FormattedTime("y".repeat(count), FormattedTime.TimeType.DATE);
    }
    public static FormattedTime MINUTE(int count) {
        return new FormattedTime("m".repeat(count), FormattedTime.TimeType.TIME);
    }
    public static FormattedTime SECOND(int count) {
        return new FormattedTime("s".repeat(count), FormattedTime.TimeType.TIME);
    }
    public static FormattedTime HOUR(int count) {
        return new FormattedTime("H".repeat(count), FormattedTime.TimeType.TIME);
    }
}
