package linkedList;

public class MergeSort {

	public static void main(String[] args) {
		Node n1=new Node(3);
		Node n2=new Node(5);
		Node n3=new Node(2);
		Node n4=new Node(4);
		Node n5=new Node(2);
		
		Node head=n1;
		head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		MergeSort(head);
		
		

	}
	
	public static Node MergeSort(Node head) {
		Node mid=getMid(head);
		Node midNext=mid.next;
		mid.next=null;
		Node left=MergeSort(head);
		Node right=MergeSort(midNext);
		Node Sorted=Merger(left,right);
		return Sorted;
		
	}
	
	public static Node getMid(Node head) {
		Node fast=head;
		Node slow=head;
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}
	
	public static Node Merger(Node a,Node b) {
		Node result=null;
		if(a==null) {
			return b;
		}	
		if(b==null) {
			return a;
		}
		if(a.data<=b.data) {
			result=a;
			result.next=Merger(a.next,b);
		}
		else {
			result=b;
			result.next=Merger(a,b.next);
		}
		return result;
	}
	
	public static class Node{
		Node next;
		int data;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}

}
