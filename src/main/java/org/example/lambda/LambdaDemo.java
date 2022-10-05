package org.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void main(String[] args) {

        // x -> x * 2
        //anonymous function

        // Predicate - take one value and returns a boolean
        Predicate<String> predicate = x -> x.startsWith("a");

        // Function - take one value and return a value
        Function<Integer, Integer> function = x -> x * 2;

        //Supplier - does not take anything and returns a value
        Supplier<String> supplier = () -> "Hello, world!";

        //Consumer - takes one value and returns nothing
        Consumer<String> consumer = x -> System.out.println(x);

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .sorted()
                .filter(x -> x.startsWith("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

}
