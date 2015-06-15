package parkinglot;

public class TicketMachine{
	Ticket ticket;
	double currentTime;
	double rate = 3.5;

	public TicketMachine() {
	}

	public boolean dispenseTicket(){};

	public void receiveTicket(Ticket t){
		ticket = t;
	};

	public void refund(int n){};

	public int calculate(){
		int res = (int)((currentTime - ticket.startTime) * rate);
		return res;
	};

	public boolean receiveMoney(int n){
		if (n >= res) {
			refund(n - res);
			return true;
		}
		return false;
	};
}
