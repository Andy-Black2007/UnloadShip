package hw;

public class Main {

	public static void main(String[] args) {
		Port port = new Port();
		Ship ship1 = new Ship(10,port);
		Ship ship2 = new Ship(10,port);
		Ship ship3 = new Ship(10,port);
		Ship ship4 = new Ship(10,port);
		Ship ship5 = new Ship(10,port);
		
		Thread th1 = new Thread(ship1);
		Thread th2 = new Thread(ship2);
		Thread th3 = new Thread(ship3);
		Thread th4 = new Thread(ship4);
		Thread th5 = new Thread(ship5);
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
	}
}
