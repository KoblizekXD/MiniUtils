package com.koblizek.task;

import java.util.function.Consumer;

public class Task<E> {
    private enum Status {
        SUCCESSFUL,
        FAILURE
    }

    private final Status status;
    private final E value;

    private Task(E value, Status status) {
        this.status = status;
        this.value = value;
    }
    public static <T> Task<T> SUCCESS(T value) {
        return new Task<>(value, Status.SUCCESSFUL);
    }
    public static <T> Task<T> FAILURE(T value) {
        return new Task<>(value, Status.FAILURE);
    }
    public E complete() {
        return value;
    }
    public E complete(Consumer<E> then) {
        then.accept(value);
        return value;
    }
    public Task<E> then(Consumer<E> then) {
        then.accept(value);
        return this;
    }
    public Task<E> print() {
        System.out.println(value);
        return this;
    }
    public E complete(Consumer<E> success, Consumer<E> failure) {
        if (status == Status.FAILURE) failure.accept(value);
        else success.accept(value);
        return value;
    }
}
