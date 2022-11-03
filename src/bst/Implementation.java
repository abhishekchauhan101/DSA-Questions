package bst;

public class Implementation {

	public static void main(String[] args) {
		

	}
	
	public static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
			left=right=null;
			
		}
	}
	
	public static Node search(Node root,int key) {
		if(root==null || root.data==key) {
			return root;
		}
		if(key<root.data) {
			return search(root.left,key);
		}else {
			return search(root.right,key);
		}
	}
	
	public static Node insertion(Node root,int key) {
		if(root==null) {
			root=new Node(key);
			return root;
		}
		if(key<root.data) {
			root.left=insertion(root.left,key);
		}else if(key>root.data) {
			root.right=insertion(root.right,key);
		}
		return root;
		
	}

}
