package testflight;

public class Flight {
	public String id;
	public String source;
	public String destination;
	public double fare;
	public int totalSeats;
	public int availableSeats;
	public String arrivalTime;
	public String departureTime;
	public String comapnyName;
	
	public Flight() {}

	public Flight(String id, String source, String destination, double fare, int totalSeats, int availableSeats,
			String arrivalTime, String departureTime, String comapnyName) {
		
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.comapnyName = comapnyName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getComapnyName() {
		return comapnyName;
	}

	public void setComapnyName(String comapnyName) {
		this.comapnyName = comapnyName;
	}
	
	
	
}
