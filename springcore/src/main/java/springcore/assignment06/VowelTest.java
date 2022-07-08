package springcore.assignment06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VowelTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Vowel vowel = (Vowel) context.getBean("VowelID");
		
		vowel.checkVowel();
	}
}
