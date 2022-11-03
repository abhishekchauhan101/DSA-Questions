package bst;

import bst.P1.Node;

public class P2 {

	public static void main(String[] args) {
		Node root=new Node(3);
		root.right=new Node(4);
		root.left=new Node(2);
		System.out.println(check(root,Integer.MIN_VALUE,Integer.MAX_VALUE));

	}
	public static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
			left=right=null;
			
		}
	}
	
	public static boolean check(Node root, int min, int max) {
		if(root==null) {
			return true;
			
			
		}
		
		if(root.data<min ||root.data>max) {
			return false;
		}
		return (check(root.left,min,root.data-1)&&check(root.right,root.data+1,max));
	}

}
