package org.example.collections;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Hello");

        List<String> myList2 = new LinkedList<>();
        Queue<String> myList3 = new LinkedList<>();

        Set<String> mySet = new TreeSet<>();
        Set<String> mySet2 = new LinkedHashSet<>();
        Set<String> mySet3 = new HashSet<>();
        Queue<String> mySomething = new PriorityQueue<>();

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(3,"Three");
        myMap.put(2,"Two");
        myMap.put(3,"Four");
        System.out.println(myMap.get(3));
        System.out.println(myMap.get(4));
    }
}