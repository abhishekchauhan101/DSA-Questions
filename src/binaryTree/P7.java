package binaryTree;
import java.util.*;
import binaryTree.P6.Node;

public class P7 {

	public static void main(String[] args) {
		ArrayList<Integer> ans=new ArrayList<>();
		
		
	}
	
	public static void printLeft(Node root,ArrayList<Integer> ans) {
		if(root!=null) {
			if(root.left!=null) {
				ans.add(root.data);
				printLeft(root.left,ans);
			}
			else if(root.right!=null) {
				ans.add(root.data);
				printLeft(root.right,ans);
			}
		}
	}
	
	public static void printRight(Node root,ArrayList<Integer> ans) {
		if(root!=null) {
			if(root.right!=null) {
				ans.add(root.data);
				printLeft(root.right,ans);
			}
			else if(root.left!=null) {
				ans.add(root.data);
				printLeft(root.left,ans);
			}
		}
	}
	
	public static void printLeaves(Node root,ArrayList<Integer> ans) {
		if(root!=null) {
			printLeaves(root.left,ans);
			if(root.left==null && root.right==null) {
				ans.add(root.data);
			}
			printLeaves(root.right,ans);
		}
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
