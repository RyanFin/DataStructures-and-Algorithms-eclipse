package selectionSortA;

public class ArraySel {
	private long[] a;
	private int nElems;
	
//	constructor
	public ArraySel(int max){
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
	public void swap(int min_idx, int i) {		
		long temp = a[min_idx]; 
        a[min_idx] = a[i]; 
        a[i] = temp; 
	}
	
// selection sort algorithm
	public void selectionSort() {
		int out, in, min;
		
//		time complexity = O(N^2) due to nested for-loops
		
		// One by one move boundary of unsorted subarray 
        for (int i = 0; i < nElems-1; i++) { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < nElems; j++) 
                if (a[j] < a[min_idx]) { 
                	min_idx = j; 
                }
            // Swap the found minimum element with the first 
            // element 
            swap(min_idx, i);
        } 
		
		
		
	} // end selectionSort()
}
