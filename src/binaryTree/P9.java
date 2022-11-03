package binaryTree;

import binaryTree.P7.Node;

public class P9 {

	public static void main(String[] args) {
		

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
	
	public static int solve(Node root) {
		if(root==null) {
			return 0;
		}
		int a=solve(root.left);
		int b=solve(root.right);
		int c=root.data;
		root.data=a+b;
		return a+b+c;
		
	}
}
