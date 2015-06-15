package parkinglot;

public class Entrance extends Gate {

	public Entrance() {
		super();
	}

	@Override
	public void open(){
		if (!ParkingLot.getInstance().isFull && isClosed && ticketMachine.dispenseTicket()) {
			isOpen = true;
			isClosed = false;
			ParkingLot.getInstance().spotsAvailable()--;
			if(ParkingLot.getInstance().spotsAvailable() == 0) {
				ParkingLot.getInstance().isFull = true;
			}
		} else {
			System.out.println("Can't enter now!");
		}
	}

	@Override
	public void close() {
		if (isOpen) {
			isClosed = true;
			isOpen = false;
		}
	}
}
