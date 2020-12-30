package com.sov.anik;

import java.util.NoSuchElementException;
import java.util.Objects;

public final class Pair<T,P> {

    private static final Pair<?,?> EMPTY = new Pair<>();

    /**
     * If non-null, the value; if null, indicates no value is present
     */
    private final T value;
    private final P value2;

    private Pair() {
        this.value = null;
        this.value2 = null;
    }

    private Pair(T value, P value2) {
        this.value = value;
        this.value2 = value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(value, pair.value) &&
                Objects.equals(value2, pair.value2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, value2);
    }

    public T getFirst() {
        if (value == null) {
            throw new NoSuchElementException("No value present");
        }
        return value;
    }


    public P getSecond() {
        if (value2 == null) {
            throw new NoSuchElementException("No value2 present");
        }
        return value2;
    }

    public static <T, P> Pair<T, P> of(T value, P value2) {
        return new Pair<>(value, value2);
    }


}
