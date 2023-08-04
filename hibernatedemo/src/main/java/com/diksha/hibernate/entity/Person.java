package com.diksha.hibernate.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Person {
	@Id
	
	private int ssn;
	@Column(name="name")
	private String pname;
	@Column(name="age")
	private String personAge;
	private char gender;
	@OneToOne
	@JoinColumn(name="address_id")
	Address address;
	public Person() {}
	
	

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", pname=" + pname + ", personAge=" + personAge + ", gender=" + gender
				+ ", address=" + address + "]";
	}



	public Person(int ssn, String pname, String personAge, char gender, Address address) {
		
		this.ssn = ssn;
		this.pname = pname;
		this.personAge = personAge;
		this.gender = gender;
		this.address = address;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPersonAge() {
		return personAge;
	}
	public void setPersonAge(String personAge) {
		this.personAge = personAge;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
