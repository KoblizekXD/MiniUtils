package com.koblizek.logging.impl;

import com.koblizek.logging.Logger;
import com.koblizek.task.Task;

// FORMAT: [TIME] [TYPE]: MESSAGE
public class SimpleLoggerImpl implements Logger {
    @Override
    public Task<Void> info(Object o) {

        return Task.SUCCESS(null);
    }

    @Override
    public Task<Void> warn(Object o) {
        return Task.SUCCESS(null);
    }

    @Override
    public Task<Void> error(Object o) {
        return Task.SUCCESS(null);
    }

    @Override
    public Task<Void> fatal(Object o) {
        return Task.SUCCESS(null);
    }

    @Override
    public Task<Void> exception(Exception e) {
        return Task.SUCCESS(null);
    }

    @Override
    public Task<Void> exception(RuntimeException e) {
        return Task.SUCCESS(null);
    }
}
