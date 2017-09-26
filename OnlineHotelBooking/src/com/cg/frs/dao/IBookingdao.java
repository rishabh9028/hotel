package com.cg.frs.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.orb.dto.RoomRegisteration;

public interface IBookingdao {

	int roomregister(RoomRegisteration rr) throws IOException, SQLException;

	ArrayList<RoomRegisteration> getDetails() throws IOException, SQLException;

	

	RoomRegisteration getByRoomNo(int room_no) throws IOException, SQLException;

	ArrayList<Integer> getAllOwnerIds() throws IOException, SQLException;

	



	


}
