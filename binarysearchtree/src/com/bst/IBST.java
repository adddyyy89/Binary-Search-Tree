package com.bst;

import com.bst.enums.TraversalType;
import com.bst.node.BSTNode;

public interface IBST {
	public BSTNode add(String data);
	
	public String delete(String data);
	
	public void display(TraversalType traversalType);
	
	public void getLevel();
}
