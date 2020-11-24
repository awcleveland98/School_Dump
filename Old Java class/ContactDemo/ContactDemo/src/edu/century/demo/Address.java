package edu.century.demo;

public class Address implements Cloneable{
	
	private String street;
	private String city;
	private String state;
	private int zipcode;
	
	public Address(String street, String city, String state, int zipcode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
  
	@Override
	protected Object clone() {
		Address copy = null;
		
		try {
			copy = (Address) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return copy;
	}

	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Address) {
			Address otherAddress = (Address) obj;
			boolean ret = (this.street.equals(otherAddress.street)
					&& (this.city.equals(otherAddress.city))
					&& (this.state.equals(otherAddress.state))
					&& (this.zipcode == otherAddress.zipcode));
			return  ret;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state="
				+ state + ", zipcode=" + zipcode + "]";
	}
	
	
	
	
	
//	@Override
//	protected Object clone()  {
//		Address copy = null;
//		
//		try {
//			copy = (Address) super.clone();
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return copy;
//	}

}
