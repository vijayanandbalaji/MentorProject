package com.cognizant.mentor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="user_table")
public class UserDetails {
	
	@Id
	private Long id;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="password")
	private String password;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="Last_name")
	private String LastName;
	
	@Column(name = "contact_number")
    @Size(max = 15)
    private String contactNumber;
	
	@Column(name="u_reg_datetime")
	private Date userRegDateTime;
	
	@Column(name="u_reg_code")
	private String userRegCode;
	
	@Column(name="active")
	private int active;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getRegDateTime() {
		return getRegDateTime();
	}

	public void setRegDateTime(Date regDateTime) {
		this.userRegDateTime = regDateTime;
	}

	public String getRegCode() {
		return getRegCode();
	}

	public void setRegCode(String regCode) {
		this.userRegCode = regCode;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
		result = prime * result + active;
		result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userRegCode == null) ? 0 : userRegCode.hashCode());
		result = prime * result + ((userRegDateTime == null) ? 0 : userRegDateTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDetails other = (UserDetails) obj;
		if (LastName == null) {
			if (other.LastName != null)
				return false;
		} else if (!LastName.equals(other.LastName))
			return false;
		if (active != other.active)
			return false;
		if (contactNumber == null) {
			if (other.contactNumber != null)
				return false;
		} else if (!contactNumber.equals(other.contactNumber))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userRegCode == null) {
			if (other.userRegCode != null)
				return false;
		} else if (!userRegCode.equals(other.userRegCode))
			return false;
		if (userRegDateTime == null) {
			if (other.userRegDateTime != null)
				return false;
		} else if (!userRegDateTime.equals(other.userRegDateTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", emailId=" + emailId + ", password=" + password + ", firstName=" + firstName
				+ ", LastName=" + LastName + ", contactNumber=" + contactNumber + ", regDateTime=" + userRegDateTime
				+ ", regCode=" + userRegCode + ", active=" + active + "]";
	}

	public UserDetails(Long id, String emailId, String password, String firstName, String lastName,
			@Size(max = 15) String contactNumber, Date regDateTime, String regCode, int active) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.password = password;
		this.firstName = firstName;
		LastName = lastName;
		this.contactNumber = contactNumber;
		this.userRegDateTime = regDateTime;
		this.userRegCode = regCode;
		this.active = active;
	}

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
