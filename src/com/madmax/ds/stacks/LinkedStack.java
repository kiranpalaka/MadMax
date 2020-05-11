package com.madmax.ds.stacks;

import java.util.EmptyStackException;

import com.madmax.ds.linkedList.SLLNode;

public class LinkedStack {

    private SLLNode top;
    private int length = 0;

    public LinkedStack() {
        length = 0;
        top = null;
    }

    public int getLength() {
        return length;
    }

    public void push(int data) {
        if (top == null) {
            top = new SLLNode(data);
            length++;
        } else {
            SLLNode newNode = new SLLNode(data);
            newNode.setNext(top);
            top = newNode;
            length++;
        }
    }

    public int pop() throws EmptyStackException {
        int result = 0;
        ;
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            SLLNode tempNode = top;
            top = tempNode.getNext();
            result = tempNode.getData();
            length--;
        }
        return result;
    }

    public boolean isEmpty() {
        boolean isEmpty = false;
        if (length == 0) {
            return true;
        }

        return isEmpty;

    }

   

    public static void main(String[] args) {
        LinkedStack lStack = new LinkedStack();
        lStack.push(5);
        lStack.push(4);
        lStack.push(45);

        lStack.pop();
        System.out.println(lStack.getLength());

    }

}