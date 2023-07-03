package com.stack;

public class Stack<T> {
    protected Item<T> top;
    protected int size = 0;

    public Stack() { }

    public Stack(T initialItem) {
        this.top = new Item<T>(initialItem);
        this.size++;
    }    

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

    public T pop() throws Exception {

        if (this.size == 0) {
            throw new Exception("A pilha está vazia", null);
        }

        T oldTop = this.top.item;
        this.top = this.top.next;
        this.size--;
        return oldTop;
    }

    public void clear() throws Exception {
        while (this.size > 0) {
            this.pop();
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
