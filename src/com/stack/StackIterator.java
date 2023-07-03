package com.stack;

public class StackIterator<T> {
    private Stack<T> currentStack = null;

    public StackIterator(Stack<T> stackToAdd) {
        this.currentStack = stackToAdd;
    }

    public String run() {
        StringBuilder returnText = new StringBuilder();
        Item<T> iterator = this.currentStack.top;

        while (iterator != null) {
            returnText.append(" -> " + iterator);
            iterator = iterator.getNext();
        }

        return returnText.toString();

    }

}
