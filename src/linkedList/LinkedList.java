package linkedList;

public class LinkedList {

	public static void main(String[] args) {
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		
		Node head=n1;
		head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=null;
//		insertAtBeg(5,head);
		deleteAtMid(head,1);
		print(head);
		
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
	
	public static void insertAtBeg(int data,Node head) {
		Node toAdd=new Node(data);
		toAdd.next=head;
		head=toAdd;
		
	}
	
	public static void insertAtEnd(Node head,int data) {
		Node toAdd=new Node(data);
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toAdd;
		toAdd.next=null;
		
	}
	
	public static void insertInMid(Node head,int data, int pos) {
		if(pos==0) {
			insertAtBeg(data,head);
			return;
		}
		Node toAdd=new Node(data);
		Node temp=head;
		for(int i=0;i<pos-1;i++) {
			temp=temp.next;
		}
		toAdd.next=temp.next;
		temp.next=toAdd;
	}
	
	public static int deleteAtBeg(Node head) {
		int temp=head.data;
		head=head.next;
		return temp;
	}
	
	public static int deleteAtEnd(Node head) {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
			
		}
		int ret=temp.next.data;
		temp.next=null;
		return ret;
	}
	
	public static int deleteAtMid(Node head,int pos) {
		if(pos==0) {
			deleteAtBeg(head);	
		}
		Node temp=head;
		for(int i=0;i<pos-1;i++) {
			temp=temp.next;
		}
		int ret=temp.next.data;
		temp.next=temp.next.next;
		return ret;
		
	}
	
	public static void reverse(Node head) {
		Node curr=head;
		Node next=null;
		Node prev=null;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=curr;
		 
	}


}

