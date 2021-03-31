package linkedListDS;

public class Link {
	public int iData;
	public double dData;
	public Link next;
	
	public Link(int i, double d) {
		this.iData = i;
		this.dData = d;
	}
	

	public void displayLink(){
		System.out.println("{" + iData + ", " + dData + "} ");
	}

}
