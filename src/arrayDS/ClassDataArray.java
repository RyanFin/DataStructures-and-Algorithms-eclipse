package arrayDS;

// Algorithms and Data structures page 67
public class ClassDataArray {
	
//	reference to the array
	private Person[] a;
	
//	number of data items
	private int nElems;
	
//	constructor
	public ClassDataArray(int max){
//		create the array
		a = new Person[max];
//		no items yet
		nElems = 0;
	}
	
//	find specified element
	public Person find(String searchName) {
		int j;
//		for each element in array of Person objects  
		for(j = 0; j < nElems; j++) {
//			found item?
			if(a[j].getLastName().equals(searchName)) {
//				exit loop before end
				break;
			}
		}
		
//		gone to end?
		if(j ==  nElems) {
//			yes, then you cannot find the target element
			return null;
		} else {
//			otherwise you found it
			return a[j];
		}	
	}
	
	public void insert(String last, String first, int age) {
//		add new Person to the array
		a[nElems] = new Person(last, first, age);
//		increase the counter value
		nElems++;
	}
	
//	delete the specified element with a search by name
	public boolean delete(String searchName){
		int j;
		
		for (j = 0; j < nElems; j++) {
			if(a[j].getLastName().equals(searchName)) {
//				exit current iteration at the found item
				break;
			}
		}
		
		if(j == nElems){
//			 Can't find the target elem
			return false;
		} else {
			for (int k = 0; k < nElems; k++) {
//				shift down
				a[k] = a[k + 1];
//				decrement size
				nElems --;
				return true;
			}
		}
		return false;
	}
	
//	display all array elems 
	public void displayA() {
		for (int i = 0; i < nElems; i++) {
			a[i].displayPerson();
		}
	}
	
	
	
	

}
