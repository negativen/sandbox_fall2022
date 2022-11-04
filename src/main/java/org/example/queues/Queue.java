package org.example.queues;

public interface Queue<E> {

    void offer(E element);
    E poll();
    E peek();
    boolean isEmpty();

}
