package linkedListDS;

public class LinkList {
	
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd);
		newLink.next = first;
		first = newLink;
	}
	
	

}
