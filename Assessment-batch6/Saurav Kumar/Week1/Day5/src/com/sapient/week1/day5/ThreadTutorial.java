package com.sapient.week1.day5;

class ThreadInner extends Thread {
	String name;
	int n;
	public ThreadInner(String name, int n) {
		super();
		this.name = name;
		this.n = n;
	}
	
	public ThreadInner() {
		super();
		name = "sapient";
		n = 10;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name+" " + i);
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTutorial {
	public static void main(String[] args) {
		ThreadInner demoInner = new ThreadInner();
		ThreadInner demoInner1 = new ThreadInner("Wipro", 137);
		ThreadInner demoInner2 = new ThreadInner("Infosys", 13);
		
		demoInner.start();
		demoInner1.start();
		demoInner2.start();
	}

	
}
