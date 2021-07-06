package p1;

public class EmployeeTO {

	private String fname;
	private String lname;
	private int age;
	private double salary;

	public EmployeeTO() {
		super();
	}
	
	public EmployeeTO(String fname, String lname, int age, double salary) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.salary = salary;
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
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EmployeeTO [fname=" + fname + ", lname=" + lname + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
