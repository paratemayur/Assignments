package springcore.assignment13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieSystemTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		MovieSystem movieSystem = context.getBean("msID", MovieSystem.class);
		
		movieSystem.display();
	}
}
