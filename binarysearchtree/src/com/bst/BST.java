package com.bst;

import com.bst.enums.TraversalType;
import com.bst.node.BSTNode;

public class BST implements IBST {

	private BSTNode root;
	private int bstLevel;

	public BST() {
		root = null;
		bstLevel = 0;
	}

	@Override
	public BSTNode add(String data) {
		if (root == null) {
			root = new BSTNode(data);
			bstLevel = 1;
			return root;
		}

		BSTNode iteratorNode = root;
		return searchAdd(data, iteratorNode, 1, 1);
	}

	@Override
	public String delete(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display(TraversalType traversalType) {
		BSTNode iterNode = root;
		if (TraversalType.INORDER == traversalType) {
			System.out.print("\nIN-ORDER : ");
			dispInorder(iterNode);
		} else if (TraversalType.PREORDER == traversalType) {
			System.out.print("\nPRE-ORDER : ");
			dispPreOrder(iterNode);
		} else if (TraversalType.POSTORDER == traversalType) {
			System.out.print("\nPOST-ORDER : ");
			dispPostOrder(iterNode);
		}

	}

	@Override
	public void getLevel() {
		System.out.print("\nLevel : " + bstLevel);
	}

	private BSTNode searchAdd(String data, BSTNode iteratorNode, int lHeight, int rHeight) {
		if (iteratorNode.getData().compareTo(data) > 0) {

			if (iteratorNode.getLeft() != null) {
				searchAdd(data, iteratorNode.getLeft(), lHeight+1, rHeight);
			} else {
				iteratorNode.setLeft(new BSTNode(data));
				lHeight++;
				if (lHeight > rHeight) {
					bstLevel = lHeight;
				}
			}
		} else {
			if (iteratorNode.getRight() != null) {
				searchAdd(data, iteratorNode.getRight(), lHeight, rHeight+1);
			} else {
				iteratorNode.setRight(new BSTNode(data));
				rHeight++;
				if (lHeight < rHeight) {
					bstLevel = rHeight;
				}
			}
		}
		return null;
	}

	private void dispPostOrder(BSTNode iterNode) {
		if (iterNode == null)
			return;

		dispPostOrder(iterNode.getLeft());
		dispPostOrder(iterNode.getRight());
		System.out.print(iterNode.getData() + " ");
	}

	private void dispPreOrder(BSTNode iterNode) {
		if (iterNode == null)
			return;

		System.out.print(iterNode.getData() + " ");
		dispPreOrder(iterNode.getLeft());
		dispPreOrder(iterNode.getRight());

	}

	private void dispInorder(BSTNode iterNode) {
		if (iterNode == null)
			return;

		dispInorder(iterNode.getLeft());
		System.out.print(iterNode.getData() + " ");
		dispInorder(iterNode.getRight());

	}

}
