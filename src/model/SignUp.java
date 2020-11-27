package model;

public class SignUp {
	String fname;
	String lname;
	String uname;
	String email_id;
	String phone;
	String dob;
	String bio;
	String passwd;

	public SignUp(String fname, String lname, String uname, String email_id, String phone, String dob, String bio,String passwd) {
		this.fname = fname;
		this.lname = lname;
		this.uname = uname;
		this.email_id = email_id;
		this.phone = phone;
		this.dob = dob;
		this.bio = bio;
		this.passwd = passwd;
	}
	
	public static SignUp user;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getPassword() {
		return passwd;
	}

	public void setPassword(String password) {
		this.passwd = password;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
}
