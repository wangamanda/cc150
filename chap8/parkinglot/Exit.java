package parkinglot;

public class Exit{
	@Override
	public void open() {
		if (isClosed && ticketMachine.receiveMoney()) {
			isOpen = true;
			isClosed = false;
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
