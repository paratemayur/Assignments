package springcore.assignment12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Employee employee1 = context.getBean("emp1ID",Employee.class);
		Employee employee2 = context.getBean("emp2ID",Employee.class);
		
		list.add(employee1);
		list.add(employee2);
		
		Employee max = list.stream().max((s1 , s2) -> s1.salary > s2.salary ? 1: -1).get();
		System.out.println("Maximum salary of dep : " + max);
		
		//Print name of employees having highest salary
		System.out.println("\nPrint name of employees having highest salary : "+max.sname);
		
		Double avg = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
		List<Employee> minavg = list.stream().filter(m -> m.salary < avg).toList();
		
		System.out.println("\nName of employee having salary less than or equal to average salary");
		for(Employee e : minavg) {
			System.out.println(e.sname+" : "+e.salary);
		}
		List<String> department1 = list.stream().map(r -> r.departmnt).distinct().toList();
		
		for (String dept : department1) {
			Double avg1 = list.stream().filter(a -> a.departmnt.equals(dept)).collect(Collectors.averagingDouble(d -> d.salary));
			System.out.println("\nAverage Salary of each department : \nAverage Salary : "+avg1+ ", Department : "+dept);
			
		}
		
	}
}
