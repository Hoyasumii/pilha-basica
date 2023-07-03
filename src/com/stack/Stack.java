package com.stack;

import com.stack.interfaces.IStack;

public class Stack<T> implements IStack<T> {
    protected Item<T> top;
    protected int size = 0;

    public Stack() {}

    public Stack(T initialItem) {
        this.top = new Item<T>(initialItem);
        this.size++;
    }    

    @Override
    public void push(T newItem) {
        if (this.size == 0) {
            this.top = new Item<T>(newItem);
            this.size++;
            return;
        }

        Item<T> newTop = new Item<T>(newItem);
        newTop.setNext(this.top);
        this.top = newTop;
        this.size++;
    }

    @Override
    public T pop() {

        if (this.size == 0) {
            return null;
        }

        T oldTop = this.top.item;
        this.top = this.top.next;
        this.size--;
        return oldTop;
    }

    @Override
    public void clear() {
        
        this.pop();

        if (this.size > 0) {
            this.clear();
        }

    }

    public Item<T> getTop() {
        return this.top;
    }

    public Item<T> getNext() {
        return this.top.getNext();
    }

    public int getSize() {
        return this.size;
    }

}
