package com.madmax.ds.linkedList;


public class DetectCycle {

    private  static int length =0;

    public static boolean findLoop(SLLNode head) {
        boolean loopExists = false;
        SLLNode fastPtr = head;
        SLLNode SlowPtr = head;
        while (fastPtr != null && fastPtr.getNext() != null) {
            fastPtr = fastPtr.getNext().getNext();
            SlowPtr = SlowPtr.getNext();
            if (SlowPtr == fastPtr) {
                return true;
            }
        }

        return loopExists;

    }

    public static SLLNode findStartLoop(SLLNode head) {
        SLLNode fastPtr = head;
        SLLNode slwPtr = head;
        SLLNode loopStart = null;
        boolean loopExists = false;
        while (fastPtr != null && fastPtr.getNext() != null) {
            fastPtr = fastPtr.getNext().getNext();
            slwPtr = slwPtr.getNext();
            if (slwPtr == fastPtr) {

                loopExists = true;
                break;
            }
        }
        if (loopExists) {
            slwPtr = head;
            while (slwPtr != fastPtr) {
                slwPtr = slwPtr.getNext();
                fastPtr = fastPtr.getNext();
                length++;

            }
            loopStart = fastPtr;
        }

        return loopStart;

    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        SLLNode l1 = new SLLNode(1);
        SLLNode l2 = new SLLNode(2);
        SLLNode l3 = new SLLNode(3);
        list.insertAtStart(l1);
        list.insertAtEnd(l2);
        list.printCLL();
        System.out.println(findLoop(list.getHead()));

        SinglyLinkedList sll = new SinglyLinkedList();
        SLLNode sl1 = new SLLNode(3);
        SLLNode sl2 = new SLLNode(4);
        SLLNode sl3 = new SLLNode(5);
        SLLNode sl4 = new SLLNode(6);
        sll.insertAtPosition(sl1, 0);
        sll.insertAtPosition(sl2, 1);
        sll.insertAtPosition(sl3, 5);
        sll.insertAtPosition(sl4, 0);
        sll.printSLL();

        System.out.println(findLoop(sll.getHead()));

        SLLNode l6 = findStartLoop(list.getHead());
        System.out.println(l6.getData());
        System.out.println(getLength());

    }

    public static int getLength() {
        return length;
    }

   

}