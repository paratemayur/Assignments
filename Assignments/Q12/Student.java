package com.yash.tdd.Assignments.Q12;

public class Student implements Cloneable{

	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public static boolean checkClone(Student s1 , Student s2) {
		
		if(s1.id == s2.id && s1.name == s2.name)
			return true;
		else 
			return false;
	}
}
