package testflight;

public class Address {
	public String area;
	public String city;
	public String state;
	public Address() {}
	public Address(String area,String city, String state) {
		this.area=area;
		this.city = city;
		this.state = state;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
