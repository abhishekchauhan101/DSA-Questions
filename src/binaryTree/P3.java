package binaryTree;

import binaryTree.Implementation.Node;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
//		root.right.right=new Node(4);
		System.out.println(calD(root));

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
	
	
	public static int calH(Node root) {
		if(root==null) {
			return 0;
		}
		return Math.max(calH(root.left), calH(root.right))+1;
	}
	
	public static int calD(Node root) {
		if(root==null) {
			return 0;
		}
		int lH=calH(root.left);
		int rH=calH(root.right);
		int currD=Math.max(lH, rH)+1;
		
		int lD=calD(root.left);
		int rD=calD(root.right);
		int d=Math.max(lD, rD)+1;
		
		return Math.max(currD, d);
	}

}
