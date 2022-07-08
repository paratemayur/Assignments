package springcore.assignment12;

public class Employee {

	int eid;
	String sname;
	String departmnt;
	float salary;
	public Employee(int eid, String sname, String departmnt, float salary) {
		super();
		this.eid = eid;
		this.sname = sname;
		this.departmnt = departmnt;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", sname=" + sname + ", departmnt=" + departmnt + ", salary=" + salary + "]";
	}
	
}
