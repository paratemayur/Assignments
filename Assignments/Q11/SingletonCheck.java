package com.yash.tdd.Assignments.Q11;

public class SingletonCheck {
	public static boolean chechSingleton(Singleton s1, Singleton s2){
	
		if(s1.hashCode() == s2.hashCode()) {
			return true;
		}else {
			return false;
		}	
	}
}
