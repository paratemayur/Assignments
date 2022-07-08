package springcore.assignment06;

import java.util.Arrays;

public class Vowel {

	String str[];

	public String[] getStr() {
		return str;
	}
	public void setStr(String[] str) {
		this.str = str;
	}
	
	@Override
	public String toString() {
		return "Vowel [str=" + Arrays.toString(str) + "]";
	}
	public void display() {
		for (int i = 0; i < str.length; i++) {
			String j = str[i];
			System.out.println(j);
		}
	}

	public void checkVowel() {
	//	System.out.println(str);
		for (String cv : str) {
			//System.out.println(cv);
			String str1 = cv.replaceAll("[AEIOUaeiou]", "");
			if (cv.equals(str1))
				System.out.println(cv);
		}
		
	}
}
