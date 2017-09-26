package com.cg.dro.test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.frs.dao.BookingdaoImpl;
import com.cg.frs.dao.IBookingdao;

import com.cg.orb.dto.RoomRegisteration;
import com.cg.orb.exception.BookingApplnException;



public class ApplnTest {
	static IBookingdao dao=null;
	static RoomRegisteration bean=null;
	@BeforeClass
	public static void initialize() throws BookingApplnException
	{
		System.out.println("hi");
		dao=new BookingdaoImpl();
		bean=new RoomRegisteration();		
	}
	@Test
	public void test() {

		bean.setHotel_ID(1);
		bean.setRoom_type(1);
		bean.setRoom_area(1145);
		bean.setPaid_amt(4444);
		bean.setRent_amt(11111);
	}
	@Test
	public void testAddDetails()
	throws BookingApplnException, IOException, SQLException{
		assertNotNull(dao.roomregister(bean));
	}
	@Test
	public void getDetails() throws IOException, SQLException
	{
		assertNotNull(dao.getDetails());
	}
	

}
