package com.cg.frs.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.orb.dbutil.dbutil;
import com.cg.orb.dto.RoomRegisteration;

public class BookingdaoImpl implements IBookingdao {
	Logger logger=Logger.getRootLogger();
	public BookingdaoImpl() {
		PropertyConfigurator.configure("log4j.properties");

	}
	@Override
	public int roomregister(RoomRegisteration rr) {
		Connection conn;
		int result=0;
		try {
			conn = dbutil.getConnection();
		
		
		
		String sql="Insert into roomregisteration values(roomno_seq.nextval,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, rr.getHotel_ID());
		ps.setInt(2, rr.getRoom_type());
		ps.setInt(3,rr.getRoom_area());
		ps.setInt(4,rr.getRent_amt());
		ps.setInt(5,rr.getPaid_amt());
		result=ps.executeUpdate();
		System.out.println(result);
		
		String str = "Select roomno_seq.currval from dual";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(str);
		while(rs.next())
		{
			 result=rs.getInt(1);
		}
		logger.info("Executed Succesfully");

		} catch (IOException e) {
			logger.error("Exception Occured"+e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			
			System.out.println("Error Occured"+e.getMessage());
			e.printStackTrace();
		}

		
		return result;
	}

	@Override
	public ArrayList<RoomRegisteration> getDetails()  {
		ArrayList<RoomRegisteration> list=new ArrayList<RoomRegisteration>();
		Connection conn;
		try {
			conn = dbutil.getConnection();
		
		String sql="select * from roomregisteration";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		RoomRegisteration rr=null;
		while(rs.next())
		{
			int room_no=rs.getInt(1);
			int hotel_id=rs.getInt(2);
			int room_type=rs.getInt(3);
			int room_area=rs.getInt(4);
			int rent_amt=rs.getInt(5);
			int paid_amt=rs.getInt(6);
			list.add(new RoomRegisteration(room_no,hotel_id,room_type,room_area,rent_amt,paid_amt));
					
			
		}
		logger.info("Executed Succesfully");
		} catch (IOException e) {
			logger.error("Exception Occured"+e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Occured"+e.getMessage());
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public RoomRegisteration getByRoomNo(int room_no) {		
		Connection conn;
		RoomRegisteration rr=new RoomRegisteration();
		try {
			conn = dbutil.getConnection();
		
		String str = "Select * From RoomRegisteration where room_no = ?";
		PreparedStatement pst = conn.prepareStatement(str);
		pst.setInt(1,room_no);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next())
		{
			
			rr.setRoom_no(rs.getInt(1));
			rr.setHotel_ID(rs.getInt(2));
			rr.setRoom_type(rs.getInt(3));
			rr.setRoom_area(rs.getInt(4));
			rr.setRent_amt(rs.getInt(5));
			rr.setPaid_amt(rs.getInt(6));
			
		}
		logger.info("Executed Succesfully");
		} catch (IOException e) {
			logger.error("Exception Occured"+e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Occured"+e.getMessage());
			e.printStackTrace();
		}
		return rr;
	}

	@Override
	public ArrayList<Integer> getAllOwnerIds() {
		ArrayList<Integer> hotel_ids=new ArrayList<Integer>();
		Connection conn;
		try {
			conn = dbutil.getConnection();
		
		String str = "Select hotel_id from hotel_owners";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(str);
		while(rs.next())
		{
			hotel_ids.add(rs.getInt(1));
		}
		logger.info("Executed Succesfully");
		} catch (IOException e) {
			logger.error("Exception Occured"+e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Occured"+e.getMessage());
			e.printStackTrace();
		}
		return hotel_ids;
		
	}

	

	

}
