package edu.century.demo;

import java.util.Scanner;

public class Contact implements Cloneable {

	private String name;
	private int age;
	private double phoneNumber;
	private Address address;

	public Contact() {
		this.name = null;
		this.age = 0;
		this.phoneNumber = 0;
	}

	public Contact(String name, int age, double phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
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

	public double getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	protected Contact clone() {
		
		Contact copy = null;
		
		try {
			copy = (Contact) super.clone();
			copy.address = (Address) address.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return copy;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Contact) {
			Contact otherContact = (Contact) obj;
			
			return (otherContact.age == this.age)
					&& (otherContact.phoneNumber == this.phoneNumber)
					&& (otherContact.name.equals(this.name));
		}
		
		return false;
	
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", age=" + age + ", phoneNumber="
				+ phoneNumber + " " + address.toString() + "]";
	}

	
}
