package com.multiplex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.multiplex.beans.*;

public class SeatTypeDAO {

	static Connection con;
	public SeatType selectSeat(int typeid)
	{
		SeatType seattype = new SeatType();
		try {
			con = DBUtility.getConnection();
			if(con!=null) {
				String query =  
			}
		}
	}
}
