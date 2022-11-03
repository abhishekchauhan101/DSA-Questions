package binaryTree;
import java.util.*;
import binaryTree.Implementation.Node;

public class TopView {

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
	
	public static class obj{
		Node n;
		int level;
		public obj(Node n,int level) {
			this.n=n;
			this.level=level;
			
		}
	}
	
	public static void TopView(Node root) {
		Queue<obj> q=new LinkedList<obj>();
		if(root==null) {
			return;
		}
		q.add(new obj(root,0));
		Map<Node,Integer> mp=new HashMap<>();
		
		while(!q.isEmpty()) {
			obj temp=q.poll();
			if(!mp.containsKey(temp.level)) {
				mp.put(temp.n, temp.level);
			}
			if(temp.n.left!=null) {
				q.add(new obj(temp.n.left,-1));
			}
			if(temp.n.right!=null) {
				q.add(new obj(temp.n.right,+1));
			}
		}
	}
	

}
