package hw;

public class Ship implements Runnable {
	private int boxes;
	private Port port;

	public Ship() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ship(int boxes, Port port) {
		super();
		this.boxes = boxes;
		this.port = port;
	}

	public int getBoxes() {
		return boxes;
	}

	public void setBoxes(int boxes) {
		this.boxes = boxes;
	}

	public Port getPort() {
		return port;
	}

	public void setPort(Port port) {
		this.port = port;
	}

	@Override
	public void run() {
		try {
			port.unloadShip(this);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
