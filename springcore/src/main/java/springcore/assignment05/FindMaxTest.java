package springcore.assignment05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FindMaxTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		FindMax findMax = context.getBean("maxID", FindMax.class);
		
		findMax.maxNum();
		
	}
}
