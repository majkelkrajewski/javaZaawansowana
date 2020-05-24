package com.sda.box;

public class Box<E> {
    private E element;

    public Box(E element) {
        this.element = element;
    }

    public E get() {
        return element;
    }

    public void set(E element) {
        this.element = element;
    }
}
