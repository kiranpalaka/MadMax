package com.madmax.ds.linkedList;

public class IntersectingList {

    private static int length1 = 0;
    private static int length2 = 0;

    public static void main(String[] args) {
        SLLNode l5 = new SLLNode(1);
        SLLNode l6 = new SLLNode(2);
        SLLNode l1 = new SLLNode(3);
        SLLNode l2 = new SLLNode(4);
        SLLNode l3 = new SLLNode(5);
        SLLNode l4 = new SLLNode(6);
        SLLNode l7 = new SLLNode(7);
        SLLNode l8 = new SLLNode(8);

        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insertAtPosition(l7, 0);
        list1.insertAtPosition(l1, 1);
        list1.insertAtPosition(l2, 2);
        list1.insertAtPosition(l3, 3);
        list1.insertAtPosition(l4, 4);
        list1.printSLL();
        length1 = list1.getLength();

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insertAtPosition(l5, 0);
        list2.insertAtPosition(l6, 1);
        list2.insertAtPosition(l1, 2);
        list2.insertAtPosition(l2, 3);
        list2.insertAtPosition(l3, 4);
        list2.insertAtPosition(l4, 5);
        list2.printSLL();
        length2 = list2.getLength();

        int data = getNode(list1.getHead(), list2.getHead());
        System.out.println("Intersection node:" + data);
    }

    public static int getinterSectionPoint(int d, SLLNode node1, SLLNode node2) {
        SLLNode currnode1 = node1;
        SLLNode currNode2 = node2;
        for (int i = 0; i < d; i++) {
            currnode1 = currnode1.getNext();
        }

        while (currnode1 != null && currNode2 != null) {
            if (currnode1.getData() == currNode2.getData()) {
                return currnode1.getData();
            }
            currnode1 = currnode1.getNext();
            currNode2 = currNode2.getNext();
        }

        return -1;
    }

    public static int getNode(SLLNode node1, SLLNode node2) {
        if (length1 > length2) {
            int d = length1 - length2;
            return getinterSectionPoint(d, node1, node2);
        }
        if (length1 < length2) {
            int d = length2 - length1;
            return getinterSectionPoint(d, node2, node1);
        }
        return -1;
    }
}