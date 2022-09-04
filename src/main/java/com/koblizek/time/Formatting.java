package com.koblizek.time;

public final class Formatting {
    private Formatting() {}

    public static String DAY(int count) {
        return "d".repeat(count);
    }
    public static String MONTH(int count) {
        return "M".repeat(count);
    }
    public static String YEAR(int count) {
        return "y".repeat(count);
    }
    public static String MINUTE(int count) {
        return "m".repeat(count);
    }
    public static String SECOND(int count) {
        return "s".repeat(count);
    }
    public static String HOUR(int count) {
        return "H".repeat(count);
    }
}
