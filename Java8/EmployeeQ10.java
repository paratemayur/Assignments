package com.yash.lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class EmployeeQ10
{
	int eid;
	String ename;
	public EmployeeQ10(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public EmployeeQ10() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "EmployeeQ10 [eid=" + eid + ", ename=" + ename +"]";
	}
}

class ArrayListCnvtMapToSetQ10 {
	public static void main(String[] args) {
		List<EmployeeQ10> list = new ArrayList<>();

		list.add(new EmployeeQ10(1, "Subrat"));
		list.add(new EmployeeQ10(2, "Akshay"));
		list.add(new EmployeeQ10(3, "Nikhil"));
		list.add(new EmployeeQ10(4, "Mayur"));
		list.add(new EmployeeQ10(5, "Ayush"));
		list.add(new EmployeeQ10(6, "Aakash"));
		list.add(new EmployeeQ10(7, "Pratik"));
		list.add(new EmployeeQ10(8, "Piyush"));
		list.add(new EmployeeQ10(9, "Ankush"));
		list.add(new EmployeeQ10(10, "Pranjal"));

		// list
		System.out.println("all object print by using list");
		for (EmployeeQ10 emp : list) {
			System.out.println("id: " + emp.eid + " " + "Name: " + emp.ename);
		}
		//Map<Integer, String> map = list.stream().collect(Collectors.toMap(E1->E1., null, null))
		// list to Set
		System.out.println("=======================================================");
		System.out.println("all object print by using Set");
		Set<EmployeeQ10> set = list.stream().collect(Collectors.toSet());
		for (EmployeeQ10 emp : set) {
			System.out.println("id: " + emp.eid + " " + "Name: " + emp.ename);
		}

		//list to map
		Map<Integer, String> map = list.stream().collect(Collectors.toMap(E1->E1.getEid(), E1->E1.getEname()));
		System.out.println("========================================================");
		System.out.println("all object print by using Map");
		System.out.println(map);
	
	}
}

