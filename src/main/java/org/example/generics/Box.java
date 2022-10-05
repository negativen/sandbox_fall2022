package org.example.generics;

import java.util.Objects;

public class Box<T> {
    private T t;

    public Box(T value) {
        this.t = value;
    }

    public T getValue() {
        return t;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Objects.equals(t, box.t);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Box{");
        sb.append("value=").append(t);
        sb.append('}');
        return sb.toString();
    }
}