package springcore.assignment07;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

public class Array1 {

	int[] array1 = new int[5];
	
	Array2 arr2;
	
	public Array1(int[] array1, Array2 arr2) {
		super();
		this.array1 = array1;
		this.arr2 = arr2;
	}
	public void displayArr1() {
		System.out.println("Display first Array : ");
		for (int i = 0; i < array1.length; i++) {
			int j = array1[i];
			System.out.print(j+" ");
		}
		
	}

	public void mergeArray() {
		int array3[] = new int[array1.length + arr2.array2.length];
		

		int index = 0;
		System.out.println("\nMerge Array1 and Array2 : ");
		for (int i = 0; i < array3.length; i++) {
			if (i < array1.length) 
				array3[index++] = array1[i];
				if (i < arr2.array2.length) {
					array3[index++] = arr2.array2[i];
				}
				int j = array3[i];
				System.out.print(j+" ");
		}
		
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<array3.length; i++) {
			if(max < array3[i])
				max = array3[i];
		}
			
		System.out.println("\n Maximum number of array : "+max);
	}
	
}
