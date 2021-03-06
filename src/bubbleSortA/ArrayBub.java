package bubbleSortA;

public class ArrayBub {
	private long[] a;
	private int nElems;
	
//	constructor
	public ArrayBub(int max){
		a = new long[max];
		nElems = 0;
	}
	
	public long getElem(int index) {
		return this.a[index];
	}
	
	public int length() {
		return nElems;
	}
	
//	insert elems 
	public void insert(long value){
		a[nElems] = value; // set current value at position a[nElems] to the specified long value
		nElems++; // increment size
	}
	
//	display array contents
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.print(a[i] + " "); 
			System.out.println(" ");
		}
	}
	
//	swap algorithm
	public void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
	
// bubble sort algorithm
	public void bubbleSort() {
		int out, in;
		
//		time complexity = O(N^2) due to nested for-loops
		for ( out = nElems-1; out > 1; out--) { //out moves from right to left where all elems on the right after it are sorted
			for (in = 0; in < out; in++) {
				if(a[in] > a[in+1]){ // if the element on the next right is smaller than current elem
					swap(in , in+1); // swap them
				}
			}
		}
	}
	
}
