package com.sapient.day5;

public class ThreadsDemo {
	
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
			for(int i=0;i<10;i++)
			{
				Sytem.out.println(name+"")
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
