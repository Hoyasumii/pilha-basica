package com.stack;

public class Item<T> {

    protected T item;
    protected Item<T> next = null;

    public Item(T item) {
        this.item = item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

    public void setNext(Item<T> item) {
        this.next = item;
    }

    public Item<T> getNext() { 
        return this.next; 
    }

    @Override
    public String toString() {
        return "" + this.item;
    }

}
