package com.sapient.week1.day5;

class Game {
	synchronized void f1() {
		try {
			notify();
			System.out.print("Tick - ");
			wait();
		} catch (Exception e) {
			
		}
	}
	
	synchronized void f2() {
		try {
			notify();
			System.out.println("Toc");
			wait();
		} catch (Exception e) {
			
		}
	}
}

class Player1 extends Thread {
	Game obj;

	public Player1(Game obj) {
		super();
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			//System.out.print("Player1");
			obj.f1();
		}
	}
}

class Player2 extends Thread {
	Game obj;

	public Player2(Game obj) {
		super();
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			//System.out.print("Player2");
			obj.f2();
		}
	}
}

public class ThreadTut {
	public static void main(String[] args) {
		Game game = new Game();
		Player1 player1 = new Player1(game);
		Player2 player2 = new Player2(game);
		
		player1.start();
		player2.start();
	}
}








