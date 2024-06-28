package com.techmojo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("Kondapur")
	String street; 
	@Value("Hydrabad")
	String city;
	@Value("500084")
	int Pincode;
	public Address() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Address(String street, String city, int pincode) {
		super();
		this.street = street;
		this.city = city;
		Pincode = pincode;
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
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", Pincode=" + Pincode + "]";
	}
	
		

}
