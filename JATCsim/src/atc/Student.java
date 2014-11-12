package atc;

public class Student implements User {

	
	//Generated Serial ID
	private static final long serialVersionUID = 6507139517908757274L;

	private String
	userName,
	password,
	fname,
	lname,
	address;
	
	private boolean
	hasAdminAccess;
	
	public Student(String userName, String password, String fname, String lname, 
			String address, boolean hasAdminAccess){
		
		this.userName = userName;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.hasAdminAccess = hasAdminAccess;
		
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		
		return userName;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
		
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void hasAdminAccess(boolean hasAdminAccess) {
		this.hasAdminAccess = hasAdminAccess;
	}

	@Override
	public boolean checkAdminAccess() {
		return hasAdminAccess;
	}

	@Override
	public void setFName(String fname) {
		this.fname = fname;
	}

	@Override
	public String getFName() {
		return fname;
	}

	@Override
	public void setLName(String lname) {
		this.lname = lname;
	}

	@Override
	public String getLName() {
		return lname;
	}

	@Override
	public void setAddress(String addr) {
		this.address = addr;
	}

	@Override
	public String getAddress() {
		return address;
	}
	
}
