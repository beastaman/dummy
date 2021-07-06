package com.sapient.day5;

class ThreadDemoInner extends Thread{
	
	String name;
	int n;
	
	public ThreadDemoInner(String name, int n) {
		super();
		this.name = name;
		this.n = n;
	}
	
	public ThreadDemoInner() {
		super();
		name="sapient";
		n=10;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<n;i++)
		{
			System.out.println(name+" "+i);
			try {
				sleep(10);		//context switching
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}

public class ThreadsDemo {

	public static void main(String[] args) {

		ThreadDemoInner demoInner = new ThreadDemoInner();
		ThreadDemoInner demoInner1 = new ThreadDemoInner("Wipro", 15);
		ThreadDemoInner demoInner2 = new ThreadDemoInner("Infosys", 20);
		
		demoInner.start();
		demoInner1.start();
		demoInner2.start();		
		
		System.out.println("I am in main");
		
		
	}

}
