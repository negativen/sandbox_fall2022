package org.example.collections;

import java.util.*;

import static javax.management.remote.JMXConnectorFactory.newHashMap;

public class Demo {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");

        List<String> myList2 = new LinkedList<>();
        Queue<String> myList3 = new LinkedList<>();

        Set<String> mySet = new TreeSet<>();
        Set<String> mySet2 = new LinkedHashSet<>();
        Set<String> mySet3 = new HashSet<>();
        Set<String> mySomething = new PriorityQueue<>();

        Map<Integer, String> myMap = newHashMap();
        myMap.put(1, "One");
        myMap.put(2, "Two");
        myMap.put(3, "Three");
        System.out.println(myMap.get(1));
        System.out.println(myMap.get(4));

    }
}
