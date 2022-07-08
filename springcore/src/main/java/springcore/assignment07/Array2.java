package springcore.assignment07;

import java.util.Arrays;

public class Array2 {

	int array2[] = new int[5];

	public Array2(int[] array2) {
		super();
		this.array2 = array2;
	}
	public void displayArr2() {
		System.out.println("\nDisplay Second Array : ");
		for (int i = 0; i < array2.length; i++) {
			int j = array2[i];
			System.out.print(j+" ");
		}
		
	}
	@Override
	public String toString() {
		return "Array2 [array2=" + Arrays.toString(array2) + "]";
	}
	
}
