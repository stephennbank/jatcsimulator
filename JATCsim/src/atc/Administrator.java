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
	
	/**
	 * Setter method for the username
	 */
	public void setUserName(String userName) {
		
		this.userName = userName;
		
	}
	
	/**
	 * Get method for the username
	 */
	public String getUserName() {
		
		return userName;
	}

	/**
	 * Setter method for the password
	 */
	public void setPassword(String password) {
		
		this.password = password;

	}
	
	/**
	 * Getter method for the password
	 */
	public String getPassword() {
		
		return password;
		
	}

	/**
	 * Sets the user as an administrator
	 */
	public void hasAdminAccess(boolean hasAdminAccess) {
		
		this.hasAdminAccess = hasAdminAccess;
		
	}

	/**
	 * Checks whether the user has administrator access
	 */
	public boolean checkAdminAccess() {
		
		return hasAdminAccess;
		
	}

	/**
	 * Setter method for the user's first name
	 */
	public void setFName(String fname) {
		
		this.fname = fname;
		
	}

	/**
	 * Getter for the user's first name
	 */
	public String getFName() {
		
		return fname;
		
	}

	/**
	 * Setter method for the user's last name
	 */
	public void setLName(String lname) {
		
		this.lname = lname;
		
	}

	/**
	 * Getter for the user's last name
	 */
	public String getLName() {
		
		return lname;
		
	}

	/**
	 * Setter method for the user's address
	 */
	public void setAddress(String addr) {
		
		this.address = addr;
		
	}

	/**
	 * Getter for the user's address
	 */
	public String getAddress() {
		
		return address;
		
	}
	
}
