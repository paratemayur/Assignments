package com.yash.tdd.Assignments.Q4;

public class ArmstrongOrNot {

	public static boolean checkArmOrNot(int a) {
		
		int number, temp, total = 0;
		number = a;
		while (number != 0) {
			temp = number % 10;
			total = total + temp*temp*temp;
			number = number/10;
		}
		if(total == a) {
			System.out.println(a +" is an armstrong number");
			return true;
		}else {
			System.out.println(a +" is not an armstrong number");
			return false;
		}		
	}
    public static void main(String[] args) {
    	
    	ArmstrongOrNot.checkArmOrNot(153);
    }

}
