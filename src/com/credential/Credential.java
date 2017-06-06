package com.credential;

import java.util.regex.Pattern;

public class Credential {
	private String username;
	private String password;
	
	// should contain alphabet, one special character and one digit
	// should be of minimum 6 digits and not maximum of 20 digits
	private static final String USERNAME_PATTERN = "[A-Za-z0-9_.]{6,20}";
	// should contain alphabet, one special character and one digit, 
	// should be of minimum 6 digits and not maximum of 20 digits, at-least one character should be capital letter
	private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

	// default constructor
	public Credential() {
		this.username = null;
		this.password = null;
	}

	// other constructor
	public Credential(String uname, String pwd) throws Exception {
		if (uname != null || pwd != null) {
			if (!(validateUsername(uname) && validatePassword(pwd)))
				throw new Exception("Invalid credential");
			else {
				this.username = uname;
				this.password = pwd;
			} // end of else
		} else {
			throw new Exception("Either username or password is null");
		}
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String uname) throws Exception {
		if (uname != null) {
			if (!validateUsername(uname))
				throw new Exception("Invalid username");
			else
				this.username = uname;
		} else {
			throw new Exception("Username is null");
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String pwd) throws Exception {
		// validatePassword();
		if (pwd != null) {
			if (!validatePassword(pwd))
				throw new Exception("Invalid password");
			else
				this.password = pwd;
		} else {
			throw new Exception("Password is null");
		}

	}

	public boolean validateUsername(String uname) {
		Pattern username_pattern = Pattern.compile(USERNAME_PATTERN);
		return username_pattern.matcher(uname).matches();
	}

	public boolean validatePassword(String pwd) {
		Pattern pwd_pattern = Pattern.compile(PASSWORD_PATTERN);
		return pwd_pattern.matcher(pwd).matches();
	}

	public String toString() {
		return ("Username: " + username + ", Password: " + password);
	}
}