package com.dayfive;

class ThreadRunner extends Thread {
//	Multiprocessing: 
//		Multiuser : windows is single user , linux is multi user
//		Multitasking: : windows multitasking, 
//		MultiThreading: concurrent programming from same program 
//		Threads: 
//			1) can be created by extending thread super class -> 
//				override method run -> when run begins execution, thread will start, thread will end at the run end
//				run method should not be called explicitly.
//				run method should be called from start method.

//	Context switch : one thread stops and execute another thread. (wait, notify, sleep, )
//					if not used properly, default setting is round robin algo
//				
	int n;
	String name;
	public ThreadRunner(String name, int n) {
		super();
		this.name = name;
		this.n = n;
	}

	public ThreadRunner() {
		super();
		this.name = "sapient";
		this.n = 20;
	}

	@Override
	public void run() {

		for (int i = 0; i < n; i++) {
			System.out.println(name + " " + i);
			try {
				sleep(40);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}
}

public class Threads {

	public static void main(String[] args) {

		ThreadRunner demoRunner = new ThreadRunner();
		ThreadRunner demoRunner1 = new ThreadRunner("Wipro", 5);
		ThreadRunner demoRunner2 = new ThreadRunner("Infosys", 10);

		demoRunner.start();
		demoRunner1.start();
		demoRunner2.start();

		System.out.println("In main !");

	}

}
