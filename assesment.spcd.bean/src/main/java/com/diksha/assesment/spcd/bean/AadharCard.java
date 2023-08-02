package com.diksha.assesment.spcd.bean;

public class AadharCard {
	
	private String dob;
	private String city;
	private String state;
	private long mobileNo;
	
	public AadharCard() {}

	public AadharCard(String dob, String city, String state, long mobileNo) {
		
		this.dob = dob;
		this.city = city;
		this.state = state;
		this.mobileNo = mobileNo;
	}
	

	@Override
	public String toString() {
		return "AadharCard [dob=" + dob + ", city=" + city + ", state=" + state + ", mobileNo=" + mobileNo + "]";
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
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

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
		
	
	
	
}
