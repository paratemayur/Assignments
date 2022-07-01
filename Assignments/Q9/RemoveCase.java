package com.yash.tdd.Assignments.Q9;

public class RemoveCase {

	 static String removeCase(String r) {
		
		String d = r.replaceAll("[@$-]", "");
		
		System.out.println(d);
		return d;		
	}
	public static void main(String[] args) {
		RemoveCase.removeCase(("This @Red $Car-."));
	}
}
