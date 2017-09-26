package com.cg.orb.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.orb.dto.RoomRegisteration;

public interface IBookingService {

	int roomregister(RoomRegisteration rr) throws IOException, SQLException;

	public ArrayList<RoomRegisteration> getDetails() throws IOException, SQLException;

	public RoomRegisteration getByRoomNo(int room_no) throws IOException, SQLException;

	public boolean validateHotel_Id(int hotel_Id);
	public boolean validateRoom_type(int Room_type);

	public boolean validateRoom_area(int room_area);

	public boolean validateRent_amt(int rent_amt);
	public boolean validatePaid_amt(int paid_amt);

	public ArrayList<Integer> getAllOwnerIds() throws IOException, SQLException;
}
