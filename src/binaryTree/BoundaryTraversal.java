package binaryTree;
import java.util.*;
import binaryTree.TopView.Node;

public class BoundaryTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
			this.left=this.right=null;
		}
		
	}
	
	public static boolean isLeaf(Node root) {
		if(root.left==null && root.right==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void left(Node root,ArrayList<Node> ans) {
		Node curr=root.left;
		if(isLeaf(curr)==false) {
			ans.add(curr);
		}
		if(curr.left!=null) {
			curr=curr.left;
		}else {
			curr=curr.right;
		}
	}
	
	public static void right(Node root,ArrayList<Node> ans) {
		Stack<Node> q=new Stack<>();
		Node curr=root.right;
		if(curr!=null) {
			q.add(curr);	
		}
		
		if(curr.right!=null) {
			curr=curr.right;
		}else{
			curr=curr.left;
		}
		while(!q.empty()) {
			ans.add(q.pop());
		}
		
		
	}
	
	public static void leaf(Node root,ArrayList<Node> ans) {
		if(root.left!=null) {
			leaf(root.left,ans);
		}
		if(isLeaf(root)) {
			ans.add(root);
		}
		if(root.right!=null) {
			leaf(root.right,ans);
		}
		
	}
	
	public static void Boundary(Node root) {
		ArrayList<Node> ans=new ArrayList<>();
		if(!isLeaf(root)) {
			ans.add(root);
		}
		left(root,ans);
		right(root,ans);
		leaf(root,ans);
	}

}
