package binaryTree;

import binaryTree.Implementation.Node;

public class P2 {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.right.right=new Node(4);
		System.out.println(height(root));
		

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
	
	public static int height(Node root) {
		if(root==null) {
			return 0;
		}
		int lH=height(root.left);
		int rH=height(root.right);
		return Math.max(lH, rH)+1;
	}

}
