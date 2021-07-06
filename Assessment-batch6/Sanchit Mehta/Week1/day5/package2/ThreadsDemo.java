package com.package2;


class ThreadsInner extends Thread{
	private int id;
	private String name;
	public ThreadsInner(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public ThreadsInner() {
		super();
		this.id=10;
		this.name="sapient";
	}
	@Override
	public void run() {
		for(int i=0;i<this.id;i++) {
			System.out.println(this.name+ " "+ i);
		}
	}
}
public class ThreadsDemo {
	public static void main(String[] args) {
		ThreadsInner t1= new ThreadsInner(5, "wipro");
		
		ThreadsInner t2= new ThreadsInner(6, "infy");

		ThreadsInner t3 = new ThreadsInner();
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("in main\n");
	}
	
	
	
}
