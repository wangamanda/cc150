package parkinglot;

public class Gate {
	private TicketMachine ticketMachine;
	public boolean isOpen;
	public boolean isClosed;
	
	public Gate() {
		ticketMachine = new TicketMachine();

	}

	public void open(){}

	public void close(){}
}
