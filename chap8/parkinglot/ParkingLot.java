package parkinglot;

import java.util.Spot;

public class ParkingLot {
	public boolean isFull;
	public List<Spot> spotsAvailable;
	public List<Spot> spotsUnavailable;
	public Gate Entrance, Exit;
	private static ParkingLot instance;

	public ParkingLot(List<Spot> s) {
		spotsAvailable = s;
		isFull = false;
		Entrance = new Entrance();
		Exit = new Exit();
	}

	public static ParkingLot getInstance(){
		if(instance == null)
			instance = new ParkingLot(ArrayList<Spot> spots);
		return instance;
	}
}
