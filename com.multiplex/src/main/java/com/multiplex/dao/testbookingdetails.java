package com.multiplex.dao;

import java.sql.SQLException;

import com.multiplex.beans.Booking;
import com.multiplex.beans.Shows;

public class testbookingdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking b = new Booking(1, 0, 0, null, null);
		
		BookingDAO bd = new BookingDAO();
		try {
			bd.booking(b);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
