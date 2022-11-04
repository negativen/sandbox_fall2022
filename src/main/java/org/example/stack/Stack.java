package org.example.stack;

public interface Stack<E> {

    boolean empty();
    E peek();
    E pop();
    E push();
    void push(E element);
}
