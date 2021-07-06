package com.sapient.day5;

class Game {

	synchronized void f1() {
		try {

			notifyAll();
			System.out.print("P1 - ");
			wait();
		} catch (Exception e) {

		}
	}

	synchronized void f2() {
		try {

			notifyAll();
			System.out.print("P2 -");
			wait();
		} catch (Exception e) {

		}
	}

	synchronized void f3() {
		try {
			notifyAll();
			System.out.println("P3 ");
			wait();
		} catch (Exception e) {

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
			if (i == 0) {
				try {
					sleep(100);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			game.f2();
		}

	}
}

class Player3 extends Thread {
	Game game;

	public Player3(Game game) {
		this.game = game;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				try {
					sleep(100);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			game.f3();
		}

	}
}

public class ThreadDemoSynch {

	public static void main(String[] args) {

		Game game = new Game();

		Player1 player1 = new Player1(game);
		Player2 player2 = new Player2(game);
		Player3 player3 = new Player3(game);

		player1.start();
		player2.start();
		player3.start();

	}
}
