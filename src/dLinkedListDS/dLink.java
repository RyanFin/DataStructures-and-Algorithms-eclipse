package dLinkedListDS;

public class dLink {
	public int dData;
	public dLink next;
	public dLink previous;
	
	public dLink(int data) {
		dData = data;
	}
	
	public void displayLink() {
		System.out.println(dData + " ");
	}
}
