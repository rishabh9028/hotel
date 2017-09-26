package com.cg.orb.dto;

public class HotelOwners {
	private int hotel_ID ;
	private String name;
	private String mobile;
	public int getHotel_ID() {
		return hotel_ID;
	}
	public void setHotel_ID(int hotel_ID) {
		this.hotel_ID = hotel_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public HotelOwners(int hotel_ID, String name, String mobile) {
		super();
		this.hotel_ID = hotel_ID;
		this.name = name;
		this.mobile = mobile;
	}
	public HotelOwners() {
	}
	
	
	
	
	
	
}
