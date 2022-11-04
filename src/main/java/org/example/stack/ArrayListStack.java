package org.example.stack;


import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<T> implements Stack<T> {

    private final List<T> myList = new ArrayList<>();

    @Override
    public boolean empty() {
        return myList.isEmpty();
    }

    @Override
    public T peek() {
        return myList.get(myList.size() - 1);
    }

    @Override
    public T pop() {
        return myList.remove(0);
    }

    @Override
    public T push() {
        return null;
    }

    @Override
    public void push(T element) {
         myList.add(0, element);
    }
}
