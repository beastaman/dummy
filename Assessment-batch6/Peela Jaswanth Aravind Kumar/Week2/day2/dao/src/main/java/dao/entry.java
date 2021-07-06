package dao;

public class entry {
	private String id;
	private String name;
	private int total_marks;
	public entry(String id, String name, int total_marks) {
		super();
		this.id = id;
		this.name = name;
		this.total_marks = total_marks;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal_marks() {
		return total_marks;
	}
	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}
	
	
}
