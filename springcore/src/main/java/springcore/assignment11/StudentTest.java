package springcore.assignment11;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> slist = new ArrayList<>();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Student std1 = context.getBean("std1ID", Student.class);
		Student std2 = context.getBean("std2ID", Student.class);
		Student std3 = context.getBean("std3ID", Student.class);
		Student std4 = context.getBean("std4ID", Student.class);		Student std5 = context.getBean("std5ID", Student.class);
		
		slist.add(std1);
		slist.add(std2);
		slist.add(std3);
		slist.add(std4);
		slist.add(std5);
		
		for (Student std : slist) {
			System.out.println(std.sname+ " "+ std.result.total_marks);
		}
		System.out.println();
		List<Student> sortedList = slist.stream().sorted((s1 , s2 )-> Float.compare(s1.result.total_marks, s2.result.total_marks)).toList();

		System.out.println("Sorted list of student as per total marks : ");
	
		System.out.println();
		for (Student std : sortedList) {
			System.out.println(std.sname + " "+ std.result.total_marks);
		}
	}
}
