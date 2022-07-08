package springcore.assignment02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AverageNumTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		AverageNum averageNum = context.getBean("avgID", AverageNum.class);
		
	}
}
