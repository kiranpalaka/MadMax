package com.madmax.ds.linkedList;

public class SinglyLinkedList {

	private LLNode head;

	private int length = 0;

	public SinglyLinkedList() {
		length = 0;
	}

	/*
	 * method to add node at the starting of the linked list
	 */
	public void insertAtStart(LLNode node) {
		node.setNext(head);
		head = node;
		length++;
	}

	/*
	 * Method to insert node at the end of the linked List
	 */
	public void insertAtEnd(LLNode node) {
		if (head == null) {
			head = node;
		} else {
			LLNode currNode = head;
			while (currNode.getNext() != null) {
				currNode = currNode.getNext();
			}

			currNode.setNext(node);
		}
		length++;
	}
	/*
	 * method to insert at given position
	 */

	public void insertAtPosition(LLNode node, int position) {
		if (position < 0)
			position = 0;
		if (position > length)
			position = length;

		if (position == 0) {
			insertAtStart(node);
		} else {
			LLNode tempNode = head;
			for (int i = 1; i < position; i++) {
				tempNode = tempNode.getNext();
			}
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);
			length++;
		}
	}

	public LLNode removeAtStart() {
		LLNode tempNode = head;
		if (head != null) {

			head = tempNode.getNext();
			tempNode.setNext(null);
			length--;
		}
		return tempNode;

	}

	public LLNode removeAtEnd() {
		LLNode previousNode = head, tempNode = null, next = head.getNext();
		if (next == null) {
			head = null;
			length--;
			return previousNode;
		}
		while (previousNode.getNext() != null) {
			tempNode = previousNode;
			previousNode = previousNode.getNext();
		}
		tempNode.setNext(null);
		length--;
		return previousNode;

	}

	public void removeAtPosition(int position) {
		if (position < 0)
			position = 0;
		if (position > length)
			position = length;
		if (position == 0) {
			removeAtStart();

		} else {
			LLNode currNode = head;
			for (int i = 1; i < position; i++) {
				currNode =currNode.getNext();
			}
			currNode.setNext(currNode.getNext().getNext());
			length--;
		}
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	public void printSLL() {
		LLNode currNode = head;
		while (currNode != null) {
			System.out.println(currNode.getData());
			currNode = currNode.getNext();
		}
	}

}
