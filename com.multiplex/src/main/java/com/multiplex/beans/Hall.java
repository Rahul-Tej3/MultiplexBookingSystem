package com.multiplex.beans;

public class Hall {
	
	private int hallId;
	private String hallname;
	
	public int getHallId() {
		return hallId;
	}
	public void setHallId(int hallId) {
		this.hallId = hallId;
	}
	public String getHallname() {
		return hallname;
	}
	public void setHallname(String hallname) {
		this.hallname = hallname;
	}
	public Hall(int hallId, String hallname) {
		super();
		this.hallId = hallId;
		this.hallname = hallname;
	}
	@Override
	public String toString() {
		return "Hall [hallId=" + hallId + ", hallname=" + hallname + "]";
	}
	
	

}
