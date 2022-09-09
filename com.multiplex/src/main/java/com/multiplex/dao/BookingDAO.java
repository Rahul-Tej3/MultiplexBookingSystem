package com.multiplex.dao;
import com.multiplex.beans.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.multiplex.*;
import java.sql.Date;

public class BookingDAO {
	
	
		public void booking(Booking b) throws ClassNotFoundException ,SQLException{
			
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into booking values(?,?,?,?,?)");
			ps.setInt(1, b.getBookingid());
			ps.setInt(2, b.getShowid());
			ps.setInt(3, b.getUserid());
			ps.setDate(4, (Date) b.getBookingdate());
			ps.setDate(5, (Date)b.getShowDate() );
			ps.execute();
			con.commit();
		}

}
