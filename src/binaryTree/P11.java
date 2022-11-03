package binaryTree;

import binaryTree.P10.Node;


//CHECK IF IS SUM TREE


public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isSumTree(Node root) {
		int ls;
		int rs;
		if(root==null || check(root)) {
			return true;
		}
		if(!isSumTree(root.left) && !isSumTree(root.right)) {
			if(root.left==null) {
				ls=0;
			}
			else if(!check(root.left)) {
				ls=root.left.data;
			}
			else {
				ls=2*root.left.data;
			}
			
			
			if(root.right==null) {
				rs=0;
			}
			else if(!check(root.right)) {
				rs=root.right.data;
			}
			else {
				rs=2*root.right.data;
			}
			
			if(root.data==ls+rs) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	public static boolean check(Node root) {
		if(root==null) {
			return false;
		}
		if(root.left==null && root.right==null) {
			return true;
		}
		return false;
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

}
