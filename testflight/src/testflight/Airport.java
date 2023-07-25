package testflight;

import java.util.ArrayList;

public class Airport{
	
	Address address;
	ArrayList<Flight> flights=new ArrayList<>();
	ArrayList<Traveller> traveller=new ArrayList<>();
	public Airport() {}
	
	public boolean addFlight(Flight flightObj) throws RuntimeException{
		if(this.flights.add(flightObj))
			return true;
		else
			throw new RuntimeException("No more flight can be addede");
	}
	public ArrayList<Flight> searchFlightsBySourceAndDestination(String source,String destination)  {
		
		ArrayList<Flight> flist= new ArrayList<Flight>();
		
		for(Flight f:flights)
			if(f.getSource().equals(source) && f.getDestination().equals(destination))
				flist.add(f);
		return flist;
			
		
	}
	public void bookTicket(String flightId,Traveller t) {
		for(Flight f:flights) {
			if(f.getId().equals(flightId) && f.getTotalSeats()>0) {
				t.setFlightId(flightId);
				traveller.add(t);
				f.setAvailableSeats(f.getAvailableSeats()-1);
				System.out.println("Your ticket is Booked Successfully");
				return;
				
			}
			else
				System.out.println("Ticket Booking is failed");
		}
	}
	
	
}
