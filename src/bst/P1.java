package bst;

import bst.Implementation.Node;


//DELETEION IN BST


public class P1 {

	public static void main(String[] args) {
		

	}
	public class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
			left=right=null;
			
		}
	}
	
	public static Node delete(Node root,int key) {
		if(root==null) {
			return null;
		}
		if(root.data<key) {
			root.right=delete(root.right,key);
		}
		else if(root.data>key) {
			root.left=delete(root.left,key);
		}
		else {
			if(root.right==null && root.left==null) {
				return null;
			}
			else if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			else {
				int temp=max(root);
				root.data=temp;
				root.left=delete(root.left,temp);
				
			}
		}
		return root;
	}
	public static int max(Node root) {
		if(root.right!=null) {
			return max(root.right);
		}
		else {
			return root.data;
		}
	}

}
