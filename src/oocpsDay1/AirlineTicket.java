package oocpsDay1;

public class AirlineTicket {

	 private String departureCity;
	    private String arrivalCity;
	    private String flightNumber;
	    private SeatAssignment seat;

	    public AirlineTicket(String departureCity, String arrivalCity, String flightNumber, SeatAssignment seat) {
	        this.departureCity = departureCity;
	        this.arrivalCity = arrivalCity;
	        this.flightNumber = flightNumber;
	        this.seat = seat;
	    }

	    @Override
	    public String toString() {
	        return "AirlineTicket(From: " + departureCity + " To: " + arrivalCity + ", Flight: " + flightNumber + ", Seat: " + seat + ")";
	    }

	    public static void main(String[] args) {
	        SeatAssignment seat1 = new SeatAssignment(12, 'A');
	        SeatAssignment seat2 = new SeatAssignment(15, 'B');
	        
	        AirlineTicket ticket1 = new AirlineTicket("New York", "Los Angeles", "AA123", seat1);
	        AirlineTicket ticket2 = new AirlineTicket("Chicago", "Miami", "UA456", seat2);

	        System.out.println(ticket1);
	        System.out.println(ticket2);
	    }
	}
