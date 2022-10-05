package org.example.inheritance.animal;

public interface HighOrderBehaviors {

    String value = "";

    void breathe();
    void eat();
    void sleep();
    void mate();
    void call();

    /* gang of four patterns (google)
    has to do with interfaces */

    default boolean living() {
        return true;
    }
}
