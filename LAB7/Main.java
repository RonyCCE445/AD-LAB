import java.util.*;

class Node{
	int data;
	Node next;
	
	Node(int d){
		this.data = d;
		this.next = null;
	}
	
}

class LinkedList{
	public Node create() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter numbers, enter 0 to stop");
	int a = sc.nextInt();
	Node head = new Node(a);
	Node temp = head;
	while(a != 0) {
		a = sc.nextInt();
		temp.next = new Node(a);
		temp = temp.next;
		
	}
	
	return head;
	}
	
	public void traverse(Node head) {
		Node temp = head;
		while(temp.next != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
	
	public Node delete(Node head) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter number to delete");
		int d = sc.nextInt();
		Node temp = head;
		if(head.data == d) {
			head = head.next;
			return head;
		}
		while(temp.next != null) {
			
			if(temp.next.data == d) {
				temp.next = temp.next.next;
			}
			temp = temp.next;
		}
		return head;
	}
	
	public Node insert(Node head) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter number to insert");
		int num  = sc.nextInt();
		System.out.println("Enter position");
		int k = sc.nextInt();
		Node n = new Node(num);
		if(k == 0) {
			n.next = head;
			head = n;
			return head;
		}
		Node temp = head;
		int count = 1;
		while(temp.next != null) {
			if(count == k) {
				n.next = temp.next;
				temp.next = n;
			}
			count++;
			temp = temp.next;
		}
		return head;
	}
	
	public Node reverse(Node head) {
	    Node curr = head;
	    Node next = null;
	    Node prev = new Node(head.data);
	    while (curr != null) {
	        next = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr =next;
	    }
	    
	    return prev.next;
	}
	
}

public class Main {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		Node head = l.create();
		l.traverse(head);
//		head = l.delete(head);
//		l.traverse(head);
//		head = l.insert(head);
//		l.traverse(head);
		head = l.reverse(head);
		System.out.println();
		l.traverse(head);
		
		
		
		

	}

}