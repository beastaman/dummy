package com.day5;

class ThreadDemo extends Thread {

	String name;
	int number;

	public ThreadDemo() {
		super();
		this.name = "SAPIENT";
		this.number = 100;
	}

	public ThreadDemo(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	@Override
	public void run() {
		for (int i = 0; i < number; ++i) {
			System.out.println(name + ":" + i);
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class DemoThreads {

	public static void main(String[] args) {

		ThreadDemo demo1 = new ThreadDemo();
		ThreadDemo demo2 = new ThreadDemo("Wipro", 20);
		ThreadDemo demo3 = new ThreadDemo("Infosys", 200);

		demo1.start();
		demo2.start();
		demo3.start();

		System.out.println("Program Ended");

	}

}
