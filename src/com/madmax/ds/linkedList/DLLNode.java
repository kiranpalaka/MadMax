package com.madmax.ds.linkedList;

public class DLLNode {
    private int data;
    private DLLNode prev;
    private DLLNode Next;

    public DLLNode(int data) {
        this.data = data;
        prev = null;
        Next = null;

    }

    public DLLNode(int data, DLLNode prev, DLLNode next) {
        this.data = data;
        this.prev = prev;
        this.Next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DLLNode getPrev() {
        return prev;
    }

    public void setPrev(DLLNode prev) {
        this.prev = prev;
    }

    public DLLNode getNext() {
        return Next;
    }

    public void setNext(DLLNode next) {
        Next = next;
    }

}