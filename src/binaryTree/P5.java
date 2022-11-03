package binaryTree;
import java.util.*;
import binaryTree.P4.Node;

//ZIG-ZAG TRAVERSAL


public class P5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ans=new ArrayList<>();
		
		Node root=new Node(1);
		boolean lr=true;
		Stack<Node> currLevel=new Stack<>();
		Stack<Node> nextLevel=new Stack<>();
		
		currLevel.push(root);
		
		while(currLevel.isEmpty()!=true) {
			Node popped=currLevel.pop();
			
			if(popped!=null) {
				ans.add(popped.data);
				if(lr==true) {
					if(popped.left!=null) {
						nextLevel.add(popped.left);
					}
					if(popped.right!=null) {
						nextLevel.add(popped.right);
					}
				}
				else {
					if(popped.right!=null) {
						nextLevel.add(popped.right);
					}
					if(popped.left!=null) {
						nextLevel.add(popped.left);
					}
				}
				
			}
			Stack<Node> temp=new Stack<>();
			lr=!lr;
			temp=currLevel;
			currLevel=nextLevel;
			nextLevel=temp;
					
			
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
