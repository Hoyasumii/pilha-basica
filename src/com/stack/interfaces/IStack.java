package com.stack.interfaces;

public interface IStack<T> {
    void push(T newItem);
    T pop();
    void clear();
}