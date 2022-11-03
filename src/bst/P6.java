package bst;
import java.util.*;
import bst.P5.Node;


//CONVERT BST TO A BALANCED TREE




public class P6 {

	public static void main(String[] args) {
		Node root=new Node(1);
		ArrayList<Node> st=new ArrayList<>();
		store(st,root);
		int end=st.size();
		build(root,st,0,end-1);
		
	}
	
	
	public static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
			left=right=null;
			
		}
	}
	
	public static void store(ArrayList<Node> st,Node root) {
		if(root==null) {
			return;
		}
		store(st,root.left);
		st.add(root);
		store(st,root.right);
		
	}
	
	
	public static Node build(Node root,ArrayList<Node> st,int start,int end) {
		if(start>end) {
			return null;
		}
		int mid=(start+end)/2;
		Node enter=st.get(mid);
		build(root,st,start,mid-1);
		build(root,st,mid+1,end);
		return enter; 
		
	}

}
