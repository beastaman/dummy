package p2;

class Game {
	synchronized void f1() {
		try {
			notify();
			System.out.print("p1-");
			wait();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	synchronized void f2() {
		try {
			notify();
			System.out.println("p2-");
			wait();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	synchronized void f3() {
		try {
			notify();
			System.out.print("p3");
			wait();
		} catch (Exception e) {
			System.out.println(e.getMessage());
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

class Player3 extends Thread {
	Game game;

	public Player3(Game game) {
		this.game = game;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if(i == 0) {
				try {
					
					sleep(10);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			game.f3();
		}
	}
}

public class Demo5 {

	public static void main(String[] args) {

		Game game = new Game();
		Player1 p1 = new Player1(game);
		Player2 p2 = new Player2(game);
		Player3 p3 = new Player3(game);

		p1.start();
		p2.start();
		p3.start();

	}

}