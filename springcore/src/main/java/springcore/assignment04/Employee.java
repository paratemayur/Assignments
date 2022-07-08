package springcore.assignment04;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	int eid;
	String ename;
	double salary;
	
	Department department;
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", department=" + department + "]";
	}
	
	public void employeeDetail() {
		System.out.println("Department Detail :");
		System.out.println(department);
		System.out.println("Employee id : "+ eid);
		System.out.println("Employee name : "+ ename);
		System.out.println("Employee Salary : "+salary);
	}
}
