package bst;

import bst.P2.Node;

//INORDE SUCCESSOR OF BST


public class P3 {

	public static void main(String[] args) {
		Node root=new Node(1);
		Node succ=null;
		int val=3;
		while(root!=null) {
			if(root.data<=val) {
				root=root.right;
			}
			else {
				succ=root;
				root=root.left;
			}
			
			
		}
		System.out.println(succ.data);

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
