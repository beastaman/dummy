package com.sapient.day5;

import java.lang.Thread;


class Work extends Thread{
	
	private String name;
	private int c;
	
	public Work(String name, int c) {
		this.name = name;
		this.c = c;
	}
	
	@Override
	public void run() {
		
		for(int i=1; i<=c; i++) {
			System.out.println(this.name + " " + i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}


public class ThreadsDemo {
	
	
	public static void main(String args[]) {
		Work thread1 = new Work("Sapient", 10);
		Work thread2 = new Work("Wipro", 15);
		Work thread3 = new Work("Infosys", 20);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
	

}
