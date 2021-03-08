package insertionSortA;

import bubbleSortA.ArrayBub;

public class InsertionSortApp {

	public static void main(String[] args) {
		int maxSize = 100;
		ArrayIns arr;
		arr = new ArrayIns(maxSize);
		
		arr.insert(77);
		arr.insert(99);
		arr.insert(89);
		arr.insert(23);
		arr.insert(34);
		arr.insert(123);
		arr.insert(67);
		arr.insert(45);
		arr.insert(72);
		arr.insert(71);
		arr.insert(455);
		arr.insert(423);
		arr.insert(70);
		arr.insert(90);
		arr.insert(82);
		arr.insert(84);
		arr.insert(62);
		arr.insert(97);
		arr.insert(100);
		arr.insert(101);
		
//		System.out.println("--- Before InsertionSort ---");
//		arr.display();
//		
//		arr.insertionSort();
//		
//		System.out.println("--- After InsertionSort ---");
//		arr.display();
//		
//		System.out.println("get element 2: " + arr.getElem(2));
//		System.out.println("length: " + arr.length());
		
		int expMaxSize = 100000;
		ArrayIns expArr = new ArrayIns(expMaxSize);
		
		for (int i = 0; i < expMaxSize; i++) {
			long n = (long)(java.lang.Math.random() * (expMaxSize - 1));
			expArr.insert(n);
		}

		System.out.println("Display elems before sort");
		expArr.display();
		
		expArr.insertionSort();
		System.out.println("Display elems after sort");
		expArr.display();

	}

}
