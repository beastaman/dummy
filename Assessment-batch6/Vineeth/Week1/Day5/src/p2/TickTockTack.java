package p2;

class ThreePlayersGame {
	
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
			System.out.print("Tock-");
			notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized void f3() {
		try {
			wait();
			System.out.println("Tack");
			notify();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class P1 extends Thread {
	
	ThreePlayersGame game;
	
	public P1(ThreePlayersGame game) {
		this.game = game;
	}
	
	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			game.f1();
		}
	}
}

class P2 extends Thread {
	
	ThreePlayersGame game;
	
	public P2(ThreePlayersGame game) {
		this.game = game;
	}
	
	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			game.f2();
		}
	}
}

class P3 extends Thread {
	
	ThreePlayersGame game;
	
	public P3(ThreePlayersGame game) {
		this.game = game;
	}
	
	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			game.f3();
		}
	}
}

public class TickTockTack {

	public static void main(String[] args) {
		
		ThreePlayersGame game = new ThreePlayersGame();
		P1 p1 = new P1(game);
		P2 p2 = new P2(game);
		P3 p3 = new P3(game);

		p2.start();
		p3.start();
		p1.start();
	}

}
