package com.yash.lambdaExpression;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeQ17 {

	String name;
	LocalDate dob;
	LocalDate doj;
	LocalDate dor;
	String loc;
	String department;
	double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public LocalDate getDor() {
		return dor;
	}
	public void setDor(LocalDate dor) {
		this.dor = dor;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public EmployeeQ17() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public EmployeeQ17(String name, LocalDate dob, LocalDate doj, LocalDate dor, String loc, String department,
			double salary) {
		super();
		this.name = name;
		this.dob = dob;
		this.doj = doj;
		this.dor = dor;
		this.loc = loc;
		this.department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeQ17 [name=" + name + ", dob=" + dob + ", doj=" + doj + ", dor=" + dor + ", loc=" + loc
				+ ", department=" + department + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) {
		
		List<EmployeeQ17> elist =  new ArrayList<>();
		
		elist.add(new EmployeeQ17("Mayur", LocalDate.of(2000, 02, 21), LocalDate.of(2017,04,18), LocalDate.of(2021, 10, 25), "Mumbai", "Software Devloper", 55000.0));
		elist.add(new EmployeeQ17("Akshay", LocalDate.of(1998, 03, 21), LocalDate.of(2015,05,18), LocalDate.of(2019, 12, 25), "Gurgaon", "Software Testing", 30000.0));
		elist.add(new EmployeeQ17("Ashish", LocalDate.of(1996, 11, 28), LocalDate.of(2012,06,18), LocalDate.of(2018, 11, 25), "Banglore", "Software Engineer", 50000.0));
		elist.add(new EmployeeQ17("Nikhil", LocalDate.of(1997, 8, 23), LocalDate.of(2016,07,11), LocalDate.of(2021, 10, 25), "Pune", "Java Developer", 35000.0));
		elist.add(new EmployeeQ17("Aakash", LocalDate.of(1998, 6, 21), LocalDate.of(2019,04,12), LocalDate.of(2022, 10, 25), "Mumbai", "Python Devloper", 40000.0));
		elist.add(new EmployeeQ17("Subrat", LocalDate.of(2000, 8, 03), LocalDate.of(2020,05,13), LocalDate.of(2022, 03, 25), "Hydrabad", "HR", 80000.0));
		elist.add(new EmployeeQ17("Ayush", LocalDate.of(1995, 04, 05), LocalDate.of(2013,01,14), LocalDate.of(2016, 04, 25), "Mumbai", "System Engineer", 53000.0));
		elist.add(new EmployeeQ17("Piyush", LocalDate.of(1997, 02, 01), LocalDate.of(2014,04,18), LocalDate.of(2019, 11, 25), "Nagpur", "Support Engineer", 58000.0));
		elist.add(new EmployeeQ17("Pranjal", LocalDate.of(1995, 4, 06), LocalDate.of(2010,11,15), LocalDate.of(2017, 12, 25), "Chennai", "Java Developer", 60000.0));
		elist.add(new EmployeeQ17("Pranay", LocalDate.of(1994, 5, 21), LocalDate.of(2019,04,13), LocalDate.of(2021, 07, 25), "Pune", "Software Devloper", 50000.0));
		
		System.out.println("Employee in Particular Department");
		
		Map<String, List<EmployeeQ17>> elistByDepartment = elist.stream().collect(Collectors.groupingBy(EmployeeQ17 :: getDepartment));
		
		Set<Entry<String, List<EmployeeQ17>>> entrySet = elistByDepartment.entrySet();
		for (Entry<String, List<EmployeeQ17>> entry : entrySet) {
			System.out.println("=====================================");
			System.out.println("Employees in "+entry.getKey() + " : ");
			
			List<EmployeeQ17> list = entry.getValue();
			
			for (EmployeeQ17 e : list) {
				System.out.println(e.getName());
				
			}
		}
		
		System.out.println();
		
		System.out.println("========Highest Salary==========");
		Map<String, Optional<EmployeeQ17>> hs = elist.stream().collect(Collectors.groupingBy(EmployeeQ17 :: getDepartment, Collectors.maxBy(Comparator.comparingDouble(EmployeeQ17 :: getSalary))));
		
		hs.entrySet().forEach(System.out::println);
		
		System.out.println();
		System.out.println("=========Lowest Salary==========");
		Map<String, Optional<EmployeeQ17>> ls = elist.stream().collect(Collectors.groupingBy(EmployeeQ17 :: getDepartment, Collectors.minBy(Comparator.comparingDouble(EmployeeQ17 :: getSalary))));
		
		ls.entrySet().forEach(System.out::println);
		
		System.out.println("===========================================");
		
		System.out.println("Average sallary of each department...!");
		Map<String, Double> as = elist.stream().collect(Collectors.groupingBy(EmployeeQ17 :: getDepartment, Collectors.averagingDouble(EmployeeQ17 :: getSalary)));
		
		Set<Entry<String, Double>> eSet = as.entrySet();
		
		for(Entry<String, Double> entry : eSet) {
			System.out.println(entry.getKey()+ " : "+entry.getValue());
		}
		
		System.out.println("============================================");
		
		System.out.println("Number of Employee in each department");
		Map<String, Long> noe = elist.stream().collect(Collectors.groupingBy(EmployeeQ17 :: getDepartment, Collectors.counting()));
		
		System.out.println(noe);
	}
	
	
}
