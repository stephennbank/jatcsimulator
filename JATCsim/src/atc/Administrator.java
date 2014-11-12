package atc;

public class Administrator implements User{

	
	//Generated Serial ID
	private static final long serialVersionUID = 1509847174678949584L;

	private String
	userName,
	password,
	fname,
	lname,
	address;
	
	private boolean
	hasAdminAccess;
	
	public void setUserName(String userName) {
		
		this.userName = userName;
		
	}
	
	public String getUserName() {
		
		return userName;
	}

	public void setPassword(String password) {
		
		this.password = password;

	}

	public String getPassword() {
		
		return password;
		
	}

	public void hasAdminAccess(boolean hasAdminAccess) {
		
		this.hasAdminAccess = hasAdminAccess;
		
	}

	public boolean checkAdminAccess() {
		
		return hasAdminAccess;
		
	}

	public void setFName(String fname) {
		
		this.fname = fname;
		
	}

	public String getFName() {
		
		return fname;
		
	}

	public void setLName(String lname) {
		
		this.lname = lname;
		
	}

	public String getLName() {
		
		return lname;
		
	}

	public void setAddress(String addr) {
		
		this.address = addr;
		
	}

	public String getAddress() {
		
		return address;
		
	}
	
}
