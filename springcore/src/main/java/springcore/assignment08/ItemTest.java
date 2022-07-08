package springcore.assignment08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemTest {

	public static void main(String[] args) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Item item = context.getBean("itemID", Item.class);
		
		
		item.display();
		
		System.out.println("______________Ascending Order______________");
		item.ascending();
		
		System.out.println("______________Descending Order______________");	
		item.descending();
	
		System.out.println("__________Remove Duplicate Record__________");
		item.removeDuplicate();
	}
}
