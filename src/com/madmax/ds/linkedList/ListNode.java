package com.madmax.ds.linkedList;

public class ListNode {
	private int data;
	private ListNode next;

	public ListNode(int data) {
		this.setData(data);
		setNext(null);
	}

	public ListNode() {
		setData(Integer.MIN_VALUE);
		setNext(null);
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public ListNode getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(ListNode next) {
		this.next = next;
	}

}
