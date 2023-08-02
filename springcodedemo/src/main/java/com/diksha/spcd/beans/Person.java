package com.diksha.spcd.beans;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Qualifier;
//@Component
@Service
public class Person {
	private int addharNo=4657;
	private String name="Divya Singh";
	private int age=24;
	@Autowired//setter bytype
//	@Qualifier("add2")
	private Address address;//refrence type address
	

	public Person() {}
	//@Autowired//autowire by constructor
	public Person(Address address) {
		
		this.address = address;
	}
	public Person(int addharNo, String name, int age, Address address) {
		
		this.addharNo = addharNo;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public int getAddharNo() {
		return addharNo;
	}
	public void setAddharNo(int addharNo) {
		this.addharNo = addharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public void initPerson() {
		System.out.println("From intiPerson");
	}
	public void destPerson() {
		System.out.println("From destPerson");
	}
	
	
}
