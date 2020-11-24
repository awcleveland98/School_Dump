package edu.century.demo;

public class Driver {
	
	public static void main(String[] args) {
		
		Contact contact1 = new Contact("John", 134, 612);
		Address add1 = new Address("6789 white bear", "eagn", "MN", 55116);
		contact1.setAddress(add1);
		
		
		Contact contact2 = new Contact("Sam", 44, 651);
		Address add2 = new Address("123 white bear", "eagn", "MN", 55234);
		contact2.setAddress(add2);
		
		
		Contact contact3 = contact2.clone();
		
		System.out.println("****Before****");
		System.out.println(contact2.toString());
		System.out.println(contact3.toString());
		
		contact2.getAddress().setZipcode(55666);
		
		System.out.println("****After****");
		System.out.println(contact2.toString());
		System.out.println(contact3.toString());
		
	}
}
