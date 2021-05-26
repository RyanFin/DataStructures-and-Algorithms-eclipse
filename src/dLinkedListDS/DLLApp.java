package dLinkedListDS;

public class DLLApp {

	public static void main(String[] args) {
		DoublyLinkedList dllist = new DoublyLinkedList();
		dllist.insertLast(6);
		dllist.insertLast(12);
		dllist.insertLast(18);
		
		dllist.displayFirst();
		dllist.displayLast();
		
		dllist.displayForward();
		dllist.displayBackwards();
		
		dllist.deleteValue(12);
		dllist.displayForward();

	}

}
