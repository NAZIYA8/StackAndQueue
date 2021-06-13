package com.bridgelabz;

public class Stack<T> {
    LinkedList<T> numberList = new LinkedList<T>();

    /**
     * This method is used to add elements to the stack
     *
     * @param data element passed
     */
    public void push(T data) {
        numberList.addAtStart(data);
    }

    /**
     * This method prints all the elements
     * Here Traverse till the null and
     * print till the last node's next element is null
     */
    public void show() {
        numberList.show();
    }
}
