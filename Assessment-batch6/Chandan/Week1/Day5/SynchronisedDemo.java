package com.sapient.day5;


class Game{
	
	private int chance = 0;
	
	
	synchronized void fun1() {
		
		while(chance!=0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.print("Tick -- ");
		
		chance = (chance+1)%3;
		
		notifyAll();
		
	}
	
	synchronized void fun2() {
		
		while(chance!=1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.print("Tok -- ");
		
		notify();
		
		chance = (chance+1)%3;
		
		notifyAll();
		
	}
	
	synchronized void fun3() {
		
		while(chance!=2) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Tuck");
		
		chance = (chance+1)%3;
		
		notifyAll();
		
		
	}
	
	
}


class Player1 extends Thread{
	
	Game game;
	
	public Player1(Game game) {
		this.game = game;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			game.fun1();
		}
		
	}
}
class Player2 extends Thread{
	
	Game game;
	
	public Player2(Game game) {
		this.game = game;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			game.fun2();
		}
		
	}
}
class Player3 extends Thread{
	
	Game game;
	
	public Player3(Game game) {
		this.game = game;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			game.fun3();
		}
		
	}
}




public class SynchronisedDemo {
	
	
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
