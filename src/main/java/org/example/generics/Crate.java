package org.example.generics;

public class Crate<T extends Box<?>> {

    T t;

    public Crate(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public <B extends Box<?>> Crate<Box<?>> clone(B b) {
        Crate<Box<?>> newCrate = new Crate<>(b);
        return newCrate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Crate{");
        sb.append("t=")
                .append(t);
        sb.append('}');
        return sb.toString();
    }
}