package com.madmax.ds.linkedList;

public class ReverseLinkedList {

    public static SLLNode reverseIterative(SLLNode head) {
        SLLNode currNode = head;
        SLLNode prev = null;
        SLLNode next = null;
        while (currNode != null) {
            next = currNode.getNext();
            currNode.setNext(prev);
            prev = currNode;
            currNode = next;
        }
        return prev;
    }

    public static SLLNode recursiveReverse(SLLNode head) {
        SLLNode first;
    
        if (head==null || head.getNext() == null)
            return head;
    
        first = recursiveReverse(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
    
        return first;
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
        // SLLNode reversedLinkedList = reverseIterative(list.getHead());
        // list.printSLL(reversedLinkedList);

        SLLNode rec = recursiveReverse(list.getHead());
        list.printSLL(rec);
    }
}
