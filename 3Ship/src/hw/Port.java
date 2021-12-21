package hw;

public class Port {
	private Dock[] docks = { new Dock(true), new Dock(true) };

//	public void unloadShip(Ship ship) throws InterruptedException {
//		while (true) {
//			
//			}
//		}
//	}

	public void unloadShip(Ship ship) throws InterruptedException {
		for (int i = 0; i < 2; i += 1) {
			if (docks[i].isFree()==true) {
				docks[i].unloadShip(ship);
				notifyAll();
				break;
			}
		}
	}
}
