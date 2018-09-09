package by.htp.extratask2.bean;

public class User {
	private String userId;
	private String userRole;
	private String firstName;
	private String lastName;
	
	public String getUserId() {
		return userId;
	}

	public String getUserRole() {
		return userRole;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
