package com.bst;

import com.bst.enums.TraversalType;

public interface IBST<T> {
	public T add(T data);
	
	public T delete(T data);
	
	public void display(TraversalType traversalType);
}
