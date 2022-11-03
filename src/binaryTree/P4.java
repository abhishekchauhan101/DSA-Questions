package binaryTree;
import java.util.*;
import binaryTree.P3.Node;


//TOP VIEW OF A BINARY TREE


public class P4 {

	public static void main(String[] args) {
		Node root=new Node(1);
		ArrayList<Integer> ans=new ArrayList<>();
		Queue<pair> q=new LinkedList<>();
		Map<Integer,Integer> mp=new HashMap<>();
		q.add(new pair(root,1));
		while(!q.isEmpty()) {
			pair popped=q.poll();
			if(!mp.containsKey(popped.level)) {
				mp.put(popped.level, popped.root.data);
			}
			if(popped.root.left!=null) {
				q.add(new pair(popped.root.left,popped.level-1));
				
			}
			if(popped.root.right!=null) {
				q.add(new pair(popped.root.right,popped.level+1));
			}
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
	
	public static class pair{
		Node root;
		int level;
		public pair(Node root,int l) {
			root=root;
			level=l;
		}
	}

}
