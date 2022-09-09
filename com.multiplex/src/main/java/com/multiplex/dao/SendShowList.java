package com.multiplex.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.multiplex.beans.*;

public class SendShowList {
	
		public List<Shows> sendshowlist() throws ClassNotFoundException, SQLException {
			List showlist = new ArrayList<>();
			Connection con = DBUtility.getConnection();
			Statement s = con.createStatement();
			ResultSet rq = s.executeQuery("Select * from shows");
			while(rq.next()) {
				int showId = rq.getInt(1);
				int hallId = rq.getInt(2);
				int movidId = rq.getInt(3);
				int slotId = rq.getInt(4);
				Date fromdate =(Date)rq.getDate(5);
				Date todate = (Date)rq.getDate(6);
				showlist.add(new Shows(showId, hallId, movidId, slotId, fromdate, todate));
	 		}
			return showlist;
			
		}

}
