package DataStructures.LinkedList;

public class Node {
	private Node next;
	private int value;
	
	public Node() {
		this.value = 0;
		this.next = null;
	}
	
	public Node(int value) {
		this.value = value;
		this.next = null;
	}
	
	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}
	
	public void setValue(int n) {
		this.value = n;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setNext(int n) {
		this.next = new Node(n);
	}
	
	public void setNext(Node n) {
		this.next = n;
	}
	
	public Node next() {
		return next;
	}
}
