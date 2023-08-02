package com.diksha.spcd.beans;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//@Component //indicates that this is a bean class whose xml configuration not required
@Service

public class Address {
	private String hno="163";
	private String streetName="Jubliee Hills";
	private String city="Hyd";
	private String state="TS";
	public  Address() {}
	public Address(String hno, String streetName, String city, String state) {
		
		this.hno = hno;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address \nhno=" + hno + " \nstreetName=" + streetName + " \ncity=" + city + " \nstate=" + state +"\n";
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
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
