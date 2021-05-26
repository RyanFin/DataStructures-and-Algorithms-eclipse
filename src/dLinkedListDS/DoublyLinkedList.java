package dLinkedListDS;

public class DoublyLinkedList {
	private dLink first, last;
	
	public DoublyLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}	
	
	public void insertLast(int newData) {
//		define a newlink
		dLink nl = new dLink(newData);
		if(isEmpty()) {
			first = nl;
		} else {
			last.next = nl;
			nl.previous = last;
		}
		last = nl;
	}
	
	public dLink deleteValue(int key) {
		dLink current = first;
		while(current.dData != key) {
			current = current.next;
			if(current == null) {
				return null;
			}
		}
		if(current == first) {
			first = current.next;
		} else {
			current.previous.next = current.next;
		}
		
		if(current == last) {
			last = current.previous;
		} else {
			current.next.previous = current.previous;
		}
		
		return current;
	}
	
	
	public void displayFirst() {
		dLink temp = first;
		System.out.println(temp.dData);
	}
	
	public void displayLast() {
		dLink temp = last;
		System.out.println(temp.dData);
	}
	
	public void displayForward() {
		System.out.println("List (first --> last)");
		dLink current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	
	public void displayBackwards() {
		dLink current = last;
		while(current != null) {
			current.displayLink();
			current = current.previous;
		}
		System.out.println("");
	}
	
}
