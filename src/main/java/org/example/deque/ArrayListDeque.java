package org.example.deque;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDeque<T> implements Deque<T> {

    private final List<T> myList = new ArrayList<>();

    @Override
    public void offerFirst(T element) {
        myList.add(0, element);
    }

    @Override
    public T pollFirst() {
        return myList.remove(0);
    }

    @Override
    public T peekFirst() {
        return myList.get(0);
    }

    @Override
    public void offerLast(T element) {
        myList.add(element);
    }

    @Override
    public T pollLast() {
        return myList.remove(myList.size() - 1);
    }

    @Override
    public T peekLast() {
        return myList.get(myList.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return myList.isEmpty();
    }
}