package com.bst;

import com.bst.enums.TraversalType;

public class BSTDemoApp {

	public BSTDemoApp() {
		
	}

	public static void main(String[] args) {
		BST bst = new BST();
		bst.add("G");
		bst.add("V");
		bst.add("C");
		bst.add("A");
		bst.add("R");
		bst.add("Y");
		bst.add("Z");

		bst.display(TraversalType.PREORDER);
		bst.display(TraversalType.INORDER);
		bst.display(TraversalType.POSTORDER);
		
		bst.getLevel();
	}

}
