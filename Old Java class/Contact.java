package edu.century.ch3;

import java.util.Scanner;

public class Contact implements Cloneable {

	private String name;
	private int age;
	private double phoneNumber;

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

	@Override
	protected Contact clone() {
		
		Contact copy = null;
		
		try {
			copy = (Contact) super.clone();

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
				+ phoneNumber + "]";
	}

	public static void main(String[] args) {
		
		int[] studentIDs = {312, 313, 314, 315, 316};
		
		int[] tempArray = new int[6];
		
		System.arraycopy(studentIDs, 0, tempArray, 0, studentIDs.length);
		
		studentIDs = tempArray;
		
		
	}
	
	
	
	
	
	
	
	
	
}
