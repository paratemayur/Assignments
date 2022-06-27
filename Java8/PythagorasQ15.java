package com.yash.lambdaExpression;

public class PythagorasQ15 {

	public static void main(String[] args) {
		
		int m[]= {3,4,5,12,13,4,8,45,89};
		int temp = 0;
		for (int i = 0; i < m.length-3; i++) {
			
			int n = m[i]*m[i];
			int o = m[i+1]*m[i+1];
			int p = m[i+2]*m[i+2];
			if(n == o+p || o == n+p || p == n+o) {
				temp++;
				System.out.println("pair from pythgoras theorem satisfying : "+m[i]+" "+m[i+1]+" "+m[i+2]);
			}
		}
		
		System.out.println("Total number of pair: "+temp);
	}
}
