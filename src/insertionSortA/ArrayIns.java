package insertionSortA;

public class ArrayIns {
	
	private long[] a;
	private int nElems;
	
	public ArrayIns(int max) {
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
	
//	insertion sort algorithm
	public void insertionSort() {
		int in, out;
		
		for(out=1; out < nElems; out++) { //out is the dividing line
			long temp = a[out]; //remove marked item
			in = out; // start shifts at out
			while(in > 0 && a[in-1] >= temp) { // until one is smaller
				a[in] = a[in-1]; // shift item to right
				--in; // go left one position
			}
			a[in] = temp; // insert marked item
		}
	}

}
