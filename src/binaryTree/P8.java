package binaryTree;

import binaryTree.P7.Node;

//CONVERT IN DOUBLY LINKED LIST


public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			data=data;
			this.left=null;
			this.right=null;
			
		}
	}
	
	public static void convert(Node root) {
		if(root==null) {
			return;
		}
		Node head=null;
		Node prev=null;
		if(prev==null) {
			head=root;
		}
		else{
			root.left=prev;
			prev.right=root;
			
		}
		prev=root;
		convert(root.right);
	}

}
