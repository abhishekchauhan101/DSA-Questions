package bst;

import bst.P4.Node;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Node LCA(Node root,Node n1,Node n2) {
		if(root==null) {
			return null;
		}
		if(root==n1 ||root==n2) {
			return root;
		}
		Node leftLCA=LCA(root.left,n1,n2);
		Node rightLCA=LCA(root.right,n1,n2);
		if(leftLCA!=null && rightLCA!=null) {
			return root;
		}
		else if(leftLCA!=null) {
			return leftLCA;
		}
		else {
			return rightLCA;
		}
	}
	
	public static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
			left=right=null;
			
		}
	}

}
