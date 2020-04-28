package com.madmax.ds.linkedList;

public class CircularLinkedList {
    private SLLNode head;
    private SLLNode tail;
    private int length;

    public CircularLinkedList() {
        head = new SLLNode();
        tail = new SLLNode();
        head.setNext(tail);
        tail.setNext(head);
        length = 2;
    }

    public void insertAtStart(SLLNode node) {
        node.setNext(head);
        tail.setNext(node);
        head = node;
        length++;
    }

    public void insertAtEnd(SLLNode node) {
        node.setNext(head);
        tail.setNext(node);
        tail = node;
    }

    public void deleteAtStart() {
        if (head == null) {
            System.out.println(" Its an empty linked List");
        } else {
            SLLNode new_node = head.getNext();
            tail.setNext(new_node);
            head = new_node;
            length--;
        }

    }

    public void deleteAtEnd() {
        SLLNode previous = head, q = null;
        while (previous.getNext() != head) {
            q = previous;
            previous = previous.getNext();
        }
        q.setNext(head);
        tail = q;
    }

    public void printCLL() {
        SLLNode tempNode = head;
        while (tempNode.getNext() != head) {
            System.out.println(tempNode.getData());
            tempNode = tempNode.getNext();
        }
        System.out.println(tail.getData());

    }

    public SLLNode getHead() {
        return head;
    }

    public void setHead(SLLNode head) {
        this.head = head;
    }

    public SLLNode getTail() {
        return tail;
    }

    public void setTail(SLLNode tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        SLLNode l1 = new SLLNode(1);
        SLLNode l2 = new SLLNode(2);
        SLLNode l3 = new SLLNode(3);
        list.insertAtStart(l1);
        list.insertAtEnd(l2);
        list.printCLL();
        list.deleteAtStart();
        list.printCLL();
        list.insertAtEnd(l3);
        list.printCLL();
        list.deleteAtEnd();
        list.printCLL();
    }

}