package p2;

class Game {
	
	synchronized void f1() {
		try {
			System.out.print("Tick-");
			notify();
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized void f2() {
		try {
			wait();
			System.out.println("Tock");
			notify();
		} catch (InterruptedException e) {
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
		for (int i=0;i<10;i++) {
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
		for (int i=0;i<10;i++) {
			game.f2();
		}
	}
}

public class TickTock {

	public static void main(String[] args) {
		
		Game game = new Game();
		Player1 p1 = new Player1(game);
		Player2 p2 = new Player2(game);

		p2.start();
		p1.start();
	}

}
