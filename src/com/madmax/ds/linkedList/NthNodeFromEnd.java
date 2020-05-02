package com.madmax.ds.linkedList;

public class NthNodeFromEnd {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        SLLNode l1 = new SLLNode(3);
        SLLNode l2 = new SLLNode(4);
        SLLNode l3 = new SLLNode(5);
        SLLNode l4 = new SLLNode(6);
        list.insertAtPosition(l1, 0);
        list.insertAtPosition(l2, 1);
        list.insertAtPosition(l3, 2);
        list.printSLL();
        System.out.println(getNthNodeFromEnd(list, 5).getData());
    }

    public static SLLNode getNthNodeFromEnd(SinglyLinkedList list, int n) {
        SLLNode head = list.getHead();
        SLLNode nthNode = head, tempNode = head;
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        if(n > list.getLength())
        {
            System.out.println("INput is invalid");
            return head;

        }
        for (int i = 0; i <= n; i++) {
            tempNode = tempNode.getNext();
        }
        while (tempNode != null) {
            nthNode = nthNode.getNext();
            tempNode = tempNode.getNext();
        }

        return nthNode;
    }
}