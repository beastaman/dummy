package p1;

public class EmployeeTO {
	private int age;
	private String fname;
	private String lname;
	private int salary;
	
	public EmployeeTO() {
		super();
	}
	
	public EmployeeTO(int age, String fname, String lname, int salary) {
		super();
		this.age = age;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
