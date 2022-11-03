package linkedList;

public class P1 {
	public static void main(String[] args) {
		Node n1=new Node(2);
		Node n2=new Node(3);
		Node n3=new Node(4);
		Node n4=new Node(5);
		Node n5=new Node(6);
		
		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		
		reverse(head);
//		print(head);
		
	}
	
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static void print(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			
			temp=temp.next;
		}
	}
	//REVERSE A LINKED LIST ITERATIVELY 
	public static void reverse(Node head) { 
		Node pre=null;
		Node curr=head;
		Node next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=pre;
			pre=curr;
			curr=next;
		}
		head=pre;
		System.out.println(pre.data);
	}
	
	//RECURSIVELY
	
	public static Node reverseRec(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node rest=reverseRec(head.next);
		head.next.next=head;
		head.next=null;
		return rest;

	}

	

}
