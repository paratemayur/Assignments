package springcore.assignment04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
	
		Employee employee1 = context.getBean("eid" , Employee.class);
	
		Employee employee2 = context.getBean("eid1" , Employee.class);
		
		list.add(employee1);
		list.add(employee2);
		
		List<Employee> sorted = list.stream().sorted((e1 , e2) -> Double.compare(e1.salary, e2.salary)).toList();
		
		System.out.println("Print employee Details Order by salary");

		for (Employee employee : sorted) {
			System.out.println();
			employee.employeeDetail();
		}
	
	}
}
