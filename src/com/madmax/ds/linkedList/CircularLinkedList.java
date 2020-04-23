package com.madmax.ds.linkedList;

public class CircularLinkedList {
    private LLNode head;
    private LLNode tail;
    private int length;

    public CircularLinkedList() {
        length = 0;
        head = null;
        tail = null;
    }

    public LLNode getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void insertAtEnd(LLNode node) {
        if (head == null) {
            head = node;
            tail = node;
            node.setNext(head);

        } else {
            node.setNext(head);
            tail.setNext(node);
            tail = node;

        }
        length++;

    }

    public void insertAtStart(LLNode node) {
        if (head == null) {
            head = node;
            tail = node;
            node.setNext(head);
        } else {
            tail.setNext(node);
            node.setNext(head);
            head = node;
        }
        length++;
    }

    public void removeAtStart() {
        if (head == null) {
            return;

        } else {
            tail.setNext(head.getNext());
            head = head.getNext();
            length--;
        }
    }

    public void removeAtEnd() {
        if (head == null) {
            System.out.println(" there are no elements in this list");
        } else {
            LLNode currNode = head, q = null;
            do {
                q = currNode;
                currNode = currNode.getNext();
            } while (currNode.getNext() != head);
            q.setNext(head);
            tail = q;
            length--;

        }
    }

    public void printCLL() {
        if (head == null) {
            System.out.println(" There are no nodes in the list");
        } else {
            LLNode currNode = head;
            do {
                System.out.println(currNode.getData());
                currNode = currNode.getNext();

            } while (currNode != head);

        }
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        LLNode l1 = new LLNode(1);
        LLNode l2 = new LLNode(2);

        LLNode l3 = new LLNode(3);
        list.insertAtEnd(l1);
        list.insertAtEnd(l2);
        list.insertAtStart(l3);
        list.printCLL();
        list.removeAtEnd();
        list.printCLL();

    }

}