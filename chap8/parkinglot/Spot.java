package parkinglot;

public class Spot{
	public boolean isAvailable;
	public int position;

	public Spot(int p) {
		position = p;
		isAvailable = true;
	}

	public void park(){
		isAvailable = false;
	}

	public void vacant(){
		isAvailable = true;
	}
}
