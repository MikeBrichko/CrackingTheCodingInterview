package DataStructures.LinkedList;

public class LinkedList {
	private Node head;
	
	public LinkedList() {
		this.head = null;
	}
	
	public void add(int n) {
		if(head == null) {
			this.head = new Node(n);
			return;
		}
		
		Node guide = head;
		while(guide.next() != null) {
			guide = guide.next();
		}
		
		guide.setNext(n);
	}
	
	public void remove(int n) {
		Node current = head;
		Node prev = null;
		
		if(current != null && current.getValue() == n) {
			this.head = current.next();
		}
		
		while(current.next() != null & current.getValue() != n) {
			prev= current;
			current = current.next();
		}
		
		if (current != null) {
			prev.setNext(current.next());
		} else {
			System.out.println("Not found");
		}
		
	}
	
	public boolean contains(int n) {
		Node guide = head;
		while(guide != null) {
			if(guide.getValue() == n)
				return true;
			guide = guide.next();
		}
		return false;
	}
	
	public void printLinkedList() {
		Node guide = head;
		while(guide != null) {
			System.out.println(guide.getValue());
			guide = guide.next();
		}
	}
}
