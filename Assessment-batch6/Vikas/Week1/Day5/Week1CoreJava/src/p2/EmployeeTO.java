package p2;

public class EmployeeTO {

	private int empId;
	private String fname;
	private String lname;
	private int age;
	private int salary;

	public EmployeeTO(int empId, String fname, String lname, int age, int salary) {
		super();
		this.empId = empId;
		this.fname = fname;
		this.lname = lname;
		this.age = age; 
		this.salary = salary;
	}
	
	public String checkAge() {
		if(this.age <= 0) return "Age should be a positive number!";
		return "Valid Age!";
	}
	
	public String checkSalary() {
		if(this.salary <= 0) return "Salary amount should be a positive number!";
		return "Valid Salary!";
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "EmployeeTO [empId=" + empId + ", fname=" + fname +", lname="+ lname + ", age=" + age + ", salary=" + salary+"]";
	}

	
	
	
}