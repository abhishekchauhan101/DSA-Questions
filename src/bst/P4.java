package bst;

import bst.P3.Node;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		Node prev=new Node(0);
		prev=null;
		solve(root,prev);

	}
	
	public static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
			left=right=null;
			
		}
	}
	
	public static void solve(Node root,Node prev) {
		if(root==null) {
			return;
		}
		if(prev!=null) {
			solve(root.left,prev);
		}
		prev=root;
		solve(root.right,prev);
	}

}
