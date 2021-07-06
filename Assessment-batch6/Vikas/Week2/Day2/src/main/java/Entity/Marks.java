package Entity;

public class Marks {

	private String id;
	private int testno;
	private int m1;
	private int m2;
	private int m3;

	public Marks(String id, int testno, int m1, int m2, int m3) {
		super();
		this.id = id;
		this.testno = testno;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTestno() {
		return testno;
	}

	public void setTestno(int testno) {
		this.testno = testno;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	@Override
	public String toString() {
		return "Marks [id=" + id + ", testno=" + testno + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}

}
