package com.cg.orb.dto;

public class RoomRegisteration {
 private int room_no;
 private int hotel_ID;
 private int room_type;
 private int room_area;
 private int rent_amt;
 private int paid_amt;

 public RoomRegisteration(int room_no, int hotel_ID, int room_type, int room_area, int rent_amt, int paid_amt) {
	super();
	this.room_no = room_no;
	this.hotel_ID = hotel_ID;
	this.room_type = room_type;
	this.room_area = room_area;
	this.rent_amt = rent_amt;
	this.paid_amt = paid_amt;
}

public int getRoom_no() {
	return room_no;
}

public void setRoom_no(int room_no) {
	this.room_no = room_no;
}

public int getHotel_ID() {
	return hotel_ID;
}

public void setHotel_ID(int hotel_ID) {
	this.hotel_ID = hotel_ID;
}

public int getRoom_type() {
	return room_type;
}

public void setRoom_type(int room_type) {
	this.room_type = room_type;
}

public int getRoom_area() {
	return room_area;
}

public void setRoom_area(int room_area) {
	this.room_area = room_area;
}

public int getRent_amt() {
	return rent_amt;
}

public void setRent_amt(int rent_amt) {
	this.rent_amt = rent_amt;
}

public int getPaid_amt() {
	return paid_amt;
}

public void setPaid_amt(int paid_amt) {
	this.paid_amt = paid_amt;
}

public RoomRegisteration() {

}

@Override
public String toString() {
	return "RoomRegisteration [room_no=" + room_no + ", hotel_ID=" + hotel_ID + ", room_type=" + room_type
			+ ", room_area=" + room_area + ", rent_amt=" + rent_amt + ", paid_amt=" + paid_amt + "]";
}

public RoomRegisteration(int hotel_ID, int room_type, int room_area, int rent_amt, int paid_amt) {
	super();
	this.hotel_ID = hotel_ID;
	this.room_type = room_type;
	this.room_area = room_area;
	this.rent_amt = rent_amt;
	this.paid_amt = paid_amt;
}
 

 

}
