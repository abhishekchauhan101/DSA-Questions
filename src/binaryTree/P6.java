package binaryTree;
import java.util.*;
import binaryTree.P5.Node;


//DIAGONAL TRAVERSAL


public class P6 {

	public static void main(String[] args) {
		Queue<Node> q=new LinkedList<>();
		Node root=new Node(1);
		q.add(root);
		ArrayList<Integer> ans=new ArrayList<>();
		while(!q.isEmpty()) {
			Node temp=q.poll();
			while(temp!=null) {
				if(temp.left!=null) {
					q.add(temp.left);
				}
				ans.add(temp.data);
				temp=temp.right;
			}
		}
		System.out.println(ans);
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
