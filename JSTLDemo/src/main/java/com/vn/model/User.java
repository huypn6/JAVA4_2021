package com.vn.model;

import java.io.Serializable;

//Alt + Shift + R
public class User implements Serializable {
	private static final long serialVersionUID = 5913338798803993818L;
	
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return firstName.concat(" ").concat(lastName);
	}

}
