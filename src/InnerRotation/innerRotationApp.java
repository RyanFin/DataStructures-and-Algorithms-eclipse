package InnerRotation;

import java.util.Scanner;

public class innerRotationApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // len of array
		int d = scan.nextInt(); // number of left-rotations to perform
		
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("array[(" + i + " + " + n + " - "+ d +") % "  + n);
			System.out.println(array[(i+n-d) % n] = scan.nextInt()); // user enters array values individually with space
			System.out.println("sum: [(" + (i + n - d) + ")] %" + n);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
