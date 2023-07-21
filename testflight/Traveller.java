package testflight;
import java.time.LocalDate;

public class Traveller {
	public String name;
	public int mobileNo;
	public String email;
	public String flightId;
	public LocalDate date;
	public Traveller() {}
	public Traveller(String name, int mobileNo, String email, String flightId, LocalDate date) {
		
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
		this.flightId = flightId;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
