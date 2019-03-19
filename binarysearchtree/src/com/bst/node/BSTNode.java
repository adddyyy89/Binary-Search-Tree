package com.bst.node;

public class BSTNode<T> {

	private T data;
	private T left;
	private T right;
	
	public BSTNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public BSTNode(T data, T left, T right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public T getLeft() {
		return left;
	}

	public void setLeft(T left) {
		this.left = left;
	}

	public T getRight() {
		return right;
	}

	public void setRight(T right) {
		this.right = right;
	}
	
	
	
	

}
