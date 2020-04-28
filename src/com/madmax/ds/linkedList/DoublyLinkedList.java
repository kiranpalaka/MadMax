package com.madmax.ds.linkedList;

import javax.lang.model.util.ElementScanner6;

public class DoublyLinkedList {
    private DLLNode head;
    private DLLNode tail;
    private int length;

    public DoublyLinkedList() {
        head = new DLLNode(Integer.MIN_VALUE, null, null);
        tail = new DLLNode(Integer.MIN_VALUE, head, null);
        head.setNext(tail);
        length = 0;
    }

    /**
     * Insert node before the head .
     * 
     * @param node
     */
    public void insertAtStart(DLLNode node) {
        if (head == null) {
            head = node;
        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
            length++;
        }

    }

    public void insertAtEnd(DLLNode node) {
        DLLNode tailNode = getTail();
        tailNode.setNext(node);
        node.setPrev(tailNode);
        tail = node;

    }

    public void insertAtPosition(int position, DLLNode node) {
        if (position < 0) {
            position = 0;
        }
        if (position > length) {
            position = length - 1;

        }
        if (head == null) {
            head = node;
        } else if (position == 0) {
            insertAtStart(node);
        } else {
            DLLNode currNode = head;
            for (int i = 1; i < position; i++) {
                currNode = currNode.getNext();
            }
            node.setNext(currNode.getNext());
            currNode.getNext().setPrev(node);
            currNode.setNext(node);
            node.setPrev(currNode);
            length++;
        }

    }

    public void deleteAtStart() {
        DLLNode tempNode = new DLLNode(6);
        tempNode = head;
        head = tempNode.getNext();
        head.setPrev(null);
        tempNode = null;
        length--;
    }

    public void deleteAtEnd()
    {
        DLLNode tempNode = getTail().getPrev();
        tempNode.setNext(null);
        tail = tempNode;
    }
    

    public DLLNode getHead() {
        return head;
    }

    public void setHead(DLLNode head) {
        this.head = head;
    }

    public DLLNode getTail() {
        return tail;
    }

    public void setTail(DLLNode tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void printDLL() {
        DLLNode currNode = head;
        while (currNode != null) {
            System.out.println(currNode.getData());
            currNode = currNode.getNext();
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        DLLNode d1 = new DLLNode(1);
        DLLNode d2 = new DLLNode(2);
        DLLNode d3 = new DLLNode(3);

        list.insertAtStart(d1);
        list.insertAtEnd(d3);
        list.insertAtPosition(1, d2);
        list.deleteAtStart();
        list.deleteAtEnd();
        list.printDLL();

    }

}