package com.madmax.ds.linkedList;

public class SLLClient {

	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		LLNode l1= new LLNode(1);
		LLNode l2= new LLNode(2);
		LLNode l3= new LLNode(3);
		LLNode l4= new LLNode(4);
		LLNode l5= new LLNode(5);
		LLNode l6= new LLNode(6);
		
	
		list.insertAtStart(l1);
		list.insertAtStart(l2);
		list.insertAtStart(l3);
		list.insertAtPosition(l6, 2);
		
		list.insertAtPosition(l4, 2);
		list.removeAtPosition(2);
		
		list.printSLL();
		
	}
}
