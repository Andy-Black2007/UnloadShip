package hw;

public class Port {
	private Dock[] docks = { new Dock(1), new Dock(2) };

	public void dockDistribution(Ship ship) throws InterruptedException // ������������ ������� �� �����
	{
		if (ship.getTurn() == true) {
			docks[0].unloadShip(ship);
		}
		else {
			docks[1].unloadShip(ship);
		}
	}
}
