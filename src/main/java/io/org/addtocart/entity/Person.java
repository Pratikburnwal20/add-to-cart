package io.org.addtocart.entity;

import java.util.Date;

public class Person {
	
	private int personId;
	private String personName;
	private String emailId;
	private long phoneNumber;
	private Date Dob;
	
	public Person() {}

	public Person(int personId, String personName, String emailId, long phoneNumber, Date dob) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		Dob = dob;
	}



	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDob() {
		return Dob;
	}

	public void setDob(Date dob) {
		Dob = dob;
	}
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", emailId=" + emailId + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	

}
