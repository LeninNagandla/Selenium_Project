package com.training.bean;

public class LoginBean {
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String emailUser;
	private String phoneNumber;
	private String tuserName;
	private String tpassword;

	public LoginBean() {
	}

	public LoginBean(String firstName, String lastName, String emailUser, 
			String phoneNumber, String tuserName, String tpassword  ) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailUser = emailUser;
		this.phoneNumber = phoneNumber;
		this.tuserName = tuserName;
		this.tpassword = tpassword;
	}
	
	/*public LoginBean(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
		} */

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getemailUser() {
		return emailUser;
	}

	public void setemailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String gettuserName() {
		return tuserName;
	}

	public void settuserName(String tuserName) {
		this.tuserName = tuserName;
	}
	
	public String gettpassword() {
		return tpassword;
	}

	public void settpassword(String tpassword) {
		this.tpassword = tpassword;
	}
	
	

	@Override
	public String toString() {
		
		return "LoginBean [firstName=" + firstName + ", lastName=" + lastName + ", emailUser=" + emailUser + ","
				+ "phoneNumber=" + phoneNumber + ", tuserName=" + tuserName + ""
						+ "tpassword=" + tpassword + "]";
		//return "LoginBean [userName=" + userName + ", password=" + password + "]";
	}

}
