package priorityqueueDS;

public class PriorityQApp {

	public static void main(String[] args) {
		PriorityQ thePQ = new PriorityQ(5);
		thePQ.insert(30);
		thePQ.insert(50);
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(20);
		
		System.out.println(thePQ.peekMin());
		
		while(!thePQ.isEmpty()) {
			long item = thePQ.remove();
			System.out.print(item + " ");
		}
		System.out.println(" ");
		
		System.out.println("is full?: " + thePQ.isFull());
		
		System.out.println("is empty?: " + thePQ.isEmpty());

	}

}
