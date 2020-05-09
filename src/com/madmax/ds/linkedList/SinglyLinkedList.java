package com.madmax.ds.linkedList;

public class SinglyLinkedList {
    private SLLNode head;
    private int length;

    public SinglyLinkedList() {
        length = 0;
    }

    public void insertAtPosition(SLLNode node, int position) {
        if (position < 0)
            position = 0;
        if (position > length)
            position = length;
        if (head == null) {
            head = node;
            length++;
        } else if (position == 0) {
            node.setNext(head);
            head = node;
            length++;
        } else {
            SLLNode tempNode = head;
            for (int i = 1; i < position; i++) {
                tempNode = tempNode.getNext();

            }
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
            length++;

        }

    }

    public void deleteAtPosition(int position) {
        if (position < 0)
            position = 0;
        if (position > length)
            position = length;
        if (head == null) {
            System.out.println(" Its an empty list . nothing to remove");
        } else if (position == 0) {
            SLLNode tempNode = head;
            head = tempNode.getNext();
            tempNode = null;
            length--;
        } else {
            SLLNode tempNode = head;
            for (int i = 1; i < position; i++) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
            length--;

        }

    }

    public void printSLL() {
        SLLNode currNode = head;
        while (currNode != null) {
            System.out.println(currNode.getData());
            currNode = currNode.getNext();
        }
    }
    public void printSLL(SLLNode head) {
        SLLNode currNode = head;
        while (currNode != null) {
            System.out.println(currNode.getData());
            currNode = currNode.getNext();
        }
    }

    public SLLNode getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        SLLNode l1 = new SLLNode(3);
        SLLNode l2 = new SLLNode(4);
        SLLNode l3 = new SLLNode(5);
        SLLNode l4 = new SLLNode(6);
        list.insertAtPosition(l1, 0);
        list.insertAtPosition(l2, 1);
        list.insertAtPosition(l3, 5);
        list.insertAtPosition(l4, 0);
        list.printSLL();
        System.out.println("Length of the list:" + list.getLength());
        list.deleteAtPosition(0);
        System.out.println("Printing list after deletion");
        list.printSLL();
        list.getHead();
    }
}