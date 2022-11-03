package practice;
import java.util.*;
public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static void levelOrderTra(Node root) {
		if(root==null) {
			return;
			
		}
		ArrayList<Integer> ans=new ArrayList<>();
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node poll=q.poll();
			ans.add(poll.data);
			if(poll.left!=null) {
				q.add(poll.left);
				
			}
			if(poll.right!=null) {
				q.add(poll.right);
			}
		}
	}
	public static Node mirror(Node root) {
		if(root==null) {
			return null;
			
		}
		Node newR=new Node(root.data);
		newR.left=mirror(root.right);
		newR.right=mirror(root.left);
		return newR;
	}

}
