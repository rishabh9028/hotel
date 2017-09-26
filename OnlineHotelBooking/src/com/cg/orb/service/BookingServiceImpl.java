package com.cg.orb.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.frs.dao.BookingdaoImpl;
import com.cg.frs.dao.IBookingdao;
import com.cg.orb.dto.RoomRegisteration;

public class BookingServiceImpl implements IBookingService {

	@Override
	public int roomregister(RoomRegisteration rr) throws IOException, SQLException {
		IBookingdao dao=new BookingdaoImpl();
		
		return dao.roomregister(rr);
	}

	@Override
	public ArrayList<RoomRegisteration> getDetails() throws IOException, SQLException {
		IBookingdao dao=new BookingdaoImpl();
		return dao.getDetails();
	}

	@Override
	public RoomRegisteration getByRoomNo(int room_no) throws IOException, SQLException {
		IBookingdao dao=new BookingdaoImpl();
		RoomRegisteration rr= new RoomRegisteration();
		rr=dao.getByRoomNo(room_no);
		return rr;
	}

	@Override
	public boolean validateHotel_Id(int hotel_Id) {
		if(hotel_Id==1||hotel_Id==2||hotel_Id==3)
		return true;
		else{
			System.out.println("Please Enter Correct ID");
			return false;
		}
	}

	@Override
	public boolean validateRoom_type(int Room_type) {
		if(Room_type==1||Room_type==2)
		return true;
		else{
			System.out.println("Please Choose Valide Option");
			return false;
		}
	}

	@Override
	public boolean validateRoom_area(int room_area) {
		if(room_area > 0)
			
		return true;
		else{
			System.out.println("Enter Valide Room Area");
			return false;
		}
	}

	@Override
	public boolean validateRent_amt(int rent_amt) {
		if(rent_amt > 0)
			
			return true;
			else{
				System.out.println("Enter Valide Rent amt");
				return false;
			}
	}

	@Override
	public boolean validatePaid_amt(int paid_amt) {
if(paid_amt > 0)
			
			return true;
			else{
				System.out.println("Enter Valide Paid amt");
				return false;
			}
	}

	@Override
	public ArrayList<Integer> getAllOwnerIds() throws IOException, SQLException {
IBookingdao dao=new BookingdaoImpl();
		
		return dao.getAllOwnerIds();
		
		
	}


	

	

	
	
		
	
	

}
