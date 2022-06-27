package com.yash.lambdaExpression;

public class SeriesPatternQ13 {
	
	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 6, 7, 8, 10, 11, 12, 13, 14, 17, 18, 19, 20};
		for (int i = 0; i < arr.length - 1; i++) {
			if (i <= 4) {
				String a = arr[i] + "-" + (arr[i + 2]);
				System.out.print(a + ",");
				i = i + 2;
			} else if (i <= 10) {
				String b = arr[i] + "-" + (arr[i + 4]);
				System.out.print(b + ",");
				i = i + 4;
			} else {
				String c = arr[i] + "-" + (arr[i + 3]);
				System.out.print(c);
				System.out.println(" ");
				i = i + 4;
			}
		}
	}
}
