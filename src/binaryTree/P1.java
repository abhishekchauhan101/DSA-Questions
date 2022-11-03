package binaryTree;
import java.util.*;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public static void LOT(Node root) {
		Queue<Node> q=new LinkedList<>();
		ArrayList<Integer> ans=new ArrayList<>();
		if(root==null) {
			return;
		}
		q.add(root);
		while(!q.isEmpty()) {
			root=q.peek();
			ans.add(root.data);
			q.poll();
			if(root.left!=null) {
				q.add(root.left);
			}
			if(root.right!=null) {
				q.add(root.right);
			}
		}
		//RETURN ANS(The arrayList)
	}
}
