package hw;

public class Dock {
	private boolean isFree;

	public Dock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dock(boolean isFree) {
		super();
		this.isFree = isFree;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	public synchronized void unloadShip(Ship ship) {
		isFree = false;
		for (int i = ship.getBoxes(); i >= 0; i--) {
			ship.setBoxes(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " boxes = " + ship.getBoxes());
		}
		isFree = true;
	}
}
