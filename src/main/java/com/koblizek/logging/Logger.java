package com.koblizek.logging;

import com.koblizek.task.Task;

public interface Logger {
    Task<Void> info(Object o);
    Task<Void> warn(Object o);
    Task<Void> error(Object o);
    Task<Void> fatal(Object o);
    Task<Void> exception(Exception e);
    Task<Void> exception(RuntimeException e);
    default Task<Boolean> connectTo() {

        return Task.SUCCESS(true);
    }
}
