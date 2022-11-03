package binaryTree;
import java.util.*;
import binaryTree.P8.Node;

//CONVERT TREE FROM PREORDER AND INORDER TRAVERSAL


public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	
	public Node build(int[] inorder,int[] preorder) {
		Map<Integer,Integer> mp=new HashMap<>();
		for(int i=0;i<inorder.length;i++) {
			mp.put(inorder[i], i);
		}
		
		
		Node root=buildTree(inorder,0,inorder.length-1,preorder,0,preorder.length-1,mp);	
		return root;
	}

	
	public Node buildTree(int[] inorder ,int inStart ,int inEnd ,int[] preorder ,int preStart,int preEnd, Map<Integer,Integer> mp) {
		if(preStart>preEnd || inStart>inEnd) return null;
		Node root=new Node(preorder[preStart]);
		
		int inRoot=mp.get(root.data);
		int numsLeft=inRoot-inStart;
		
		root.left=buildTree(inorder,inStart,inRoot-1,preorder,preStart+1,preStart+numsLeft,mp);
		root.right=buildTree(inorder,inRoot+1,inEnd,preorder,preStart,preStart+numsLeft+1,mp);
		return root;
	}
}
