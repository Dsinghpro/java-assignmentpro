package testflight;

import java.util.ArrayList;

public class Airport{
	
	Address address;
	ArrayList<Flight> flights;
	ArrayList<Traveller> traveller;
	
	public boolean addFlight(Flight flight) throws RuntimeException{
		if(this.flights.add(flight))
			return true;
		else
			throw new RuntimeException("No more flight can be addede");
	}
	public boolean searchFlightsBySourceAndDestination(String source,String destination) throws RuntimeException {
		
		ArrayList<Flight> flist= new ArrayList<Flight>();
		
		for(Flight f:flights)
			if(f.source.equals(source) && f.destination.equals(destination))
				return true;
			else
				throw new RuntimeException("No flight is found");
		
		return false;
		
	}
	public void bookTicket(String flightId,Traveller traveller) {
		for(Flight f:flights) {
			if(f.getId().equals(flightId) && f.getTotalSeats()>0) {
				f.setTotalSeats(f.getTotalSeats()-1);
				System.out.println(f);
				
			}
		}
	}
	
	
}
