package springcore.assignment11;

public class Student {

	int rollno;
	String sname;
	String dob;
	String classname;
	String section;
	Result result;
	
	public Student(int rollno, String sname, String dob, String classname, String section, Result result) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.dob = dob;
		this.classname = classname;
		this.section = section;
		this.result = result;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", dob=" + dob + ", classname=" + classname
				+ ", section=" + section + ", result=" + result + "]";
	}
	
	
}
