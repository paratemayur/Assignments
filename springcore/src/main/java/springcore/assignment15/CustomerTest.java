package springcore.assignment15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

		Customer customer = context.getBean("custID", Customer.class);
		
		customer.display();
	}
}
