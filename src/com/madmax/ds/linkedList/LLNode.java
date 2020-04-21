package com.madmax.ds.linkedList;

public class LLNode {
	private int data;
	private LLNode next;

	public LLNode(int data) {
		this.setData(data);
		setNext(null);
	}

	public LLNode() {
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
	public LLNode getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(LLNode next) {
		this.next = next;
	}

}
