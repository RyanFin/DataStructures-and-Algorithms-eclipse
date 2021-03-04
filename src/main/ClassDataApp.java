package main;

public class ClassDataApp {

	public static void main(String[] args) {
//	define array size
		int maxSize = 100;
//		array obj
		ClassDataArray arr;
//		instantiate array object
		arr = new ClassDataArray(maxSize);
		
//		insert the Person objects into the Object Array
		arr.insert("Evans", "Patty", 24);
		arr.insert("Super", "Mario", 45);
		arr.insert("Yee", "Tom", 15);
		arr.insert("Adams", "Smith", 34);
		arr.insert("Yakamoto", "Satoshi", 25);
		arr.insert("Vang", "Minh", 24);
		
		
//		display items
		arr.displayA();
		
//		search for an item
		Person found;
		String searchKey = "Mario";
		
		found = arr.find(searchKey);
		
		if (found != null) {
			System.out.println("Found ");
			found.displayPerson();
		} else {
			System.out.println("Person " + searchKey + "not found in arr....");
		}
		
		System.out.println("Deleting Mario, Smith, and Minh");
		arr.delete("Mario");
		arr.delete("Smith");
		arr.delete("Minh");
		
		
		arr.displayA();
		
		
		

	}

}
