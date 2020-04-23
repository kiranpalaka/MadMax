package com.madmax.ds.linkedList;

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
     * Method to insert node at position given
     * @param new_node
     * @param position
     */
    public void insertAtPosition(DLLNode new_node, int position) {
        if (position < 0)
            position = 0;
        if (position < length)
            position = length;
        if (head == null) {
            tail = head;

        }
        if (position == 0) {
            new_node.setNext(head);
            head = new_node;
            length++;
        } else {
            DLLNode tempNode = head;
            for (int i = 1; i < position; i++) {
                tempNode = tempNode.getNext();
            }
            new_node.setNext(tempNode.getNext());
            tempNode.getNext().setPrev(new_node);
            tempNode.setNext(new_node);
            length++;
        }
    }

    /**
     * Method to print the DLL
     */
    public void printDLL() {
        DLLNode currNode = head;
        while (currNode.getNext() != null) {
            System.out.println(currNode.getData());
            currNode = currNode.getNext();
        }
    }

    /**
     * Method to remove Node at specified position
     * @param position
     */
    public void removeAtPosition(int position) {
        if (position < 0)
            position = 0;
        if (position > length)
            position = length;
        if (head == null) {
            return;

        }
        if (position == 0) {
            DLLNode currNode = head.getNext();
            head= currNode;
            currNode.setPrev(null);
            length--;
        }
        else{
            DLLNode currNode = head;
            for(int i=1;i<position;i++)
            {
                currNode= currNode.getNext();
            }
            currNode.setNext(currNode.getNext().getNext());
            currNode.getNext().setPrev(currNode);
            length--;

        }
    }

    public int getLength() {
        return length;
    }

}