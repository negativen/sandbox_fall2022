package org.example.performance.recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static Map<Integer, Long> dictionary = new HashMap<>();

    public static long fib(int n) {

        //base cases
        if (n == 0) {
            return 0L;
        }

        if (n == 1) {
            return 1L;
        }

        return memo(n - 1) + memo(n - 2);
    }

    private static long memo(int i) {
        Long value = dictionary.get(i);

        if (value != null) {
            return value;
        }

        value = fib(i);
        dictionary.put(Integer.valueOf(i), value);
        return value;
        // Integer.valueOf(i) = Long
    }

    public static void main(String[] args) {

        for (int x = 0; x <= 100; x++) {
            System.out.println("fib(" + x + ") = " + fib(x));
        }


    }
}
