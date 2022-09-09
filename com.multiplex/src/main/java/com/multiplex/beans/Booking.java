package com.multiplex.beans;

import java.util.Date;

public class Booking {
	
	private int bookingid;
	private int showid;
	private int userid ;
	private Date bookingdate;
	private Date ShowDate;
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public int getShowid() {
		return showid;
	}
	public void setShowid(int showid) {
		this.showid = showid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Date getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}
	public Date getShowDate() {
		return ShowDate;
	}
	public void setShowDate(Date showDate) {
		ShowDate = showDate;
	}
	public Booking(int showid, int userid, Date bookingdate, Date showDate) {
		super();
		this.showid = showid;
		this.userid = userid;
		this.bookingdate = bookingdate;
		ShowDate = showDate;
	}
	public Booking(int bookingid, int showid, int userid, Date bookingdate, Date showDate) {
		super();
		this.bookingid = bookingid;
		this.showid = showid;
		this.userid = userid;
		this.bookingdate = bookingdate;
		ShowDate = showDate;
	}
	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", showid=" + showid + ", userid=" + userid + ", bookingdate="
				+ bookingdate + ", ShowDate=" + ShowDate + "]";
	}
	
	
}
	
	
	