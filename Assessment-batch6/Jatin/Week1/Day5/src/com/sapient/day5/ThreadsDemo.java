package com.sapient.day5;

class Game {

	synchronized public void f1() {
		try {
			notify();
			System.out.print("tick -");
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	synchronized public void f2() {
		try {
			notify();
			System.out.println(" tock");
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Player1 extends Thread {
	Game game;

	public Player1(Game game) {
		this.game = game;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			game.f1();
		}
	}

}

class Player2 extends Thread {
	Game game;

	public Player2(Game game) {
		this.game = game;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			game.f2();
		}
	}

}

public class ThreadsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		Player1 player1 = new Player1(game);
		Player2 player2 = new Player2(game);

		player1.start();
		player2.start();

	}

}
