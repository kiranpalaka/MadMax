package com.madmax.ds.linkedList;
/**
 * Author : Kiran Palaka
 * 
 */
public class SLLNode {
    private int data;
    private SLLNode next;

    public SLLNode(int data) {
        this.data = data;
        next = null;
    }

    public SLLNode() {
        data = Integer.MIN_VALUE;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SLLNode getNext() {
        return next;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }

}