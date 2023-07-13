package com.diksha.model;

public interface Flyer {
	void fly();
}
class Man {
	String Name;
	int age;
	String address;
	public Man(String name, int age, String address) {
		
		Name = name;
		this.age = age;
		this.address = address;
	}
	public void walk() {
		System.out.println("Walking");
	}
	
}
class Superman extends Man implements Flyer{
	public Superman(String name,int age,String address) {
		super(name,age,address);
		
	}
	public void fly() {
		System.out.println("Flying");
	}
}


