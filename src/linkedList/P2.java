package linkedList;

import linkedList.LinkedList.Node;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public static Node mergeSort(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node middle=findMid(head);
		Node nextMid=middle.next;
		middle.next=null;
		Node left=mergeSort(head);
		Node right=mergeSort(nextMid);
		
		Node sort=merger(left,right);
		return sort;
		
		
		
		
	}
	
	public static Node merger(Node a,Node b) {
		Node result=null;
		if(a==null) {
			return b;
		}
		if(b==null) {
			return a;
			
		}
		if(a.data<=b.data) {
			result=a;
			result.next=merger(a.next,b);
		}else {
			result=b;
			result.next=merger(a,b.next);
		}
		return result;
	}
	
	public static Node findMid(Node head) {
		Node slow=head;
		Node fast=head.next;
		while(fast!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		return slow;
	}
	
	

}
