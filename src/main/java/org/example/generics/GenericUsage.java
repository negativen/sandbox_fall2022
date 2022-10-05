package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericUsage {

    public static void main(String[] args) {

        Box<Integer> integers = new Box<>(1);
        Box<Double> doubles = new Box<>(1.0);

        List<Number> numbers = new ArrayList<>();
        numbers.add(integers.getValue());
        numbers.add(doubles.getValue());

        Crate<Box<?>> crate = new Crate(integers);
        System.out.println(crate.getT());

        Crate<Box<Double>> crate2 = new Crate(doubles);

    }
}