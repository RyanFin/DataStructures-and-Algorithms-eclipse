package main;

public class ArrayExample {

	public static void main(String[] args) {
		long[] arr = new long[10];		// reference to array
		int nElems = 0; 				// number of items 
		
//		insert elems 
		arr[0] = 77;
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 22;
		arr[5] = 88;
		arr[6] = 11;
		arr[7] = 00;
		arr[8] = 66;
		arr[9] = 33;
		
		nElems = 10;
//		display items
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i] + " ");
		}
		
//		search for items
		long searchKey = 11;
		int i;
		for (i = 0; i < arr.length; i++) {
			if (searchKey == arr[i]) {
				break;
			}
		}
			
		if(i == arr.length) {
			System.out.println("Can't find: " + searchKey);
		} else {
			System.out.println("Found: " + searchKey);
		}
		
//		delete item by searchKey
		searchKey = 66;
		nElems = arr.length;
		for (int j = 0; j < nElems; j++) {
			if(arr[j] == searchKey){
				break;
			}
			
			for(int k=j; k < nElems-1; k++) {
				arr[k] = arr[k+1];
			}
			nElems--;
		}
		
//		display items
		for(int l = 0; l < nElems; l++) {
			System.out.println(arr[l] + " ");
		}

	}

}
