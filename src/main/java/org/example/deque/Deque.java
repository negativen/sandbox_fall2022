package org.example.deque;

public interface Deque<E> {

    void offerFirst(E element);
    E pollFirst();
    E peekFirst();

    void offerLast(E element);
    E pollLast();
    E peekLast();

    boolean isEmpty();
}