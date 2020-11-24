package model;

public class EventCreation {

	private int cid;
	

	private String event_name;
	private String event_loc ;
	private String event_category ;
	private String event_reg_enddate ;
	private String event_date_time ;
	private String event_desc ;
	private String event_link ;
	private int max_count;
	
	public EventCreation(int cid, String event_name, String event_loc, String event_category, String event_reg_enddate,
			String event_date_time, String event_desc, String event_link, int max_count) {
		super();
		this.cid = cid;
		this.event_name = event_name;
		this.event_loc = event_loc;
		this.event_category = event_category;
		this.event_reg_enddate = event_reg_enddate;
		this.event_date_time = event_date_time;
		this.event_desc = event_desc;
		this.event_link = event_link;
		this.max_count = max_count;
	}
	
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getEvent_loc() {
		return event_loc;
	}
	public void setEvent_loc(String event_loc) {
		this.event_loc = event_loc;
	}
	public String getEvent_category() {
		return event_category;
	}
	public void setEvent_category(String event_category) {
		this.event_category = event_category;
	}
	public String getEvent_reg_enddate() {
		return event_reg_enddate;
	}
	public void setEvent_reg_enddate(String event_reg_enddate) {
		this.event_reg_enddate = event_reg_enddate;
	}
	public String getEvent_date_time() {
		return event_date_time;
	}
	public void setEvent_date_time(String event_date_time) {
		this.event_date_time = event_date_time;
	}
	public String getEvent_desc() {
		return event_desc;
	}
	public void setEvent_desc(String event_desc) {
		this.event_desc = event_desc;
	}
	public String getEvent_link() {
		return event_link;
	}
	public void setEvent_link(String event_link) {
		this.event_link = event_link;
	}
	public int getMax_count() {
		return max_count;
	}

	public void setMax_count(int max_count) {
		this.max_count = max_count;
	}
	
	
}
