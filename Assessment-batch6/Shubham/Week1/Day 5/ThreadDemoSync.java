
package com.sapient.day5;

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
			
			System.out.println("Toc ");
			
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
		
		for(int i=0;i<10;i++) {
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
		
		for(int i=0;i<10;i++) {
			if(i==0)
			{
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			game.f2();
		}
		
	}
	
	
}

public class ThreadDemoSync {

	public static void main(String[] args) {
		
		Game game = new Game();
		
		Player1 player1 = new Player1(game);
		Player2 player2 = new Player2(game);
		
		player1.start();
		player2.start();
	}

}
