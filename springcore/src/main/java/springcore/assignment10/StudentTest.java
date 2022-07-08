package springcore.assignment10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Student student = (Student) context.getBean("stdID");
	
	//	System.out.println(student.getStd());

	student.getStd();
	}
}
