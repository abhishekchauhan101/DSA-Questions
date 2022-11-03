package binaryTree;

public class Implementation {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		

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
	
	//Traversal
	public static void inOrder(Node root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
	public static void preOrder(Node root) {
		if(root==null) {
			return;
			
		}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(Node root) {
		if(root==null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}

}
