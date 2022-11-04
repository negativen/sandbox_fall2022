package org.example.queues;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQueue <T> implements Queue<T> {

    private final List<T> myList = new ArrayList<>();


    @Override
    public void offer(T element) {
        myList.add(element);

    }

    @Override
    public T poll() {
        return myList.remove(0);
    }

    @Override
    public T peek() {
        return myList.get(0);
    }

    @Override
    public boolean isEmpty() {
        return myList.isEmpty();
    }
}
