package com.madmax.ds.linkedList;

public class DLLClient {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        DLLNode d1 = new DLLNode(1);
        DLLNode d2 = new DLLNode(2);
        DLLNode d3 = new DLLNode(3);
        DLLNode d4 = new DLLNode(4);
        DLLNode d5 = new DLLNode(5);
        list.insertAtPosition(d1, 0);
        list.insertAtPosition(d2, 0);
        list.insertAtPosition(d3, 0);
        list.insertAtPosition(d4, 0);
        list.insertAtPosition(d5, 1);
       
        list.printDLL();
        list.removeAtPosition(0);
        list.printDLL();
        System.out.println(list.getLength());
    }

}