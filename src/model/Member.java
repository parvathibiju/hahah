package model;

public class Member {
	private String fname,lname,email,phone,event_name;
	

	private int event_id;

	public Member(String event_name , int event_id) {
		super();
		this.event_name = event_name;
		this.event_id = event_id;
	}
	public int getEvent_id() {
		return event_id;
	}

	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEvent_name() {
		return event_name;
	}
	public String setEvent_name() {
		return event_name;
	}

	public void setEvent_name(String phone) {
		this.phone = phone;
	}

	public Member(int event_id, String fname,String lname, String email, String phone, String event_name) {
		super();
		this.event_id = event_id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.event_name=event_name;
	}

}
