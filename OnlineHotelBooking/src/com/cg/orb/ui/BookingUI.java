package com.cg.orb.ui;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.orb.dto.RoomRegisteration;
import com.cg.orb.service.BookingServiceImpl;
import com.cg.orb.service.IBookingService;



public class BookingUI {
	public static void main(String[] args) throws IOException, SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Online Booking Appln");
		System.out.println("********************");
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("1.Room Registration");
			System.out.println("2.Get all Details");
			System.out.println("3.Get Details using room no");
			System.out.println("4.Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				roomregister();
				break;
			case 2:
				getDetails();
				break;
			case 3:
				getByRoomNo();
				break;
			case 4:
				System.exit(0);
				break;
				
			}
		}
	}

	private static void getByRoomNo() throws IOException, SQLException {
		Scanner sc=new Scanner(System.in);
		RoomRegisteration rr=new RoomRegisteration();
		IBookingService ibs=new BookingServiceImpl();
		System.out.println("Enter room_no of Enquiry");
		int room_no = sc.nextInt();
		rr=ibs.getByRoomNo(room_no);
		System.out.println(rr);
	}

	private static void getDetails() throws IOException, SQLException {
		IBookingService ibs=new BookingServiceImpl();
		ArrayList<RoomRegisteration> list=ibs.getDetails();
		for(RoomRegisteration d:list)
		{
			System.out.println(d);
			
		}
		
	}

	private static void roomregister() throws IOException, SQLException {
		Scanner sc=new Scanner(System.in);
		IBookingService ibs=new BookingServiceImpl();
		ibs=new BookingServiceImpl();
		ArrayList<Integer> hotel_ids=new ArrayList<Integer>();
		hotel_ids=ibs.getAllOwnerIds();
		System.out.println("Existing HotelOwner IDS Are:"+hotel_ids);
		System.out.println("Please enter your hotel owner id from above list: ");
		int hotel_ID=sc.nextInt();
		if(ibs.validateHotel_Id(hotel_ID))
		{
		System.out.println("Select  room type Type (1-1AC, 2-2NON-AC):");
		int Room_type=sc.nextInt();
		if(ibs.validateRoom_type(Room_type))
		{
		System.out.println("Enter room area in sq. ft.: ");
		int Room_area=sc.nextInt();
		if(ibs.validateRoom_area(Room_area))
		{
		System.out.println("Enter desired rent amount Rs:");
		int Rent_amt=sc.nextInt();
		if(ibs.validateRent_amt(Rent_amt))
		{
		System.out.println("Enter desired paid amount Rs:");
		int Paid_amt=sc.nextInt();
		if(ibs.validatePaid_amt(Paid_amt))
		{
		RoomRegisteration rr=new RoomRegisteration(hotel_ID,Room_type,Room_area,Rent_amt,Paid_amt);
		int result=ibs.roomregister(rr)	;

		
		System.out.println("Room successfully registered. Room no:"+result);
		
			
		
	}}}}}}

}
