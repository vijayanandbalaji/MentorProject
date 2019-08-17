package com.cognizant.mentor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mentor_table")
public class MentorDetails {
	
	@Id
	private Long id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="linkedin_url")
	private String linkedinUrl;
	
	@Column(name="m_reg_datetime")
	private Date mentorRegDateTime;
	
	@Column(name="m_reg_code")
	private String mentorRegCode;
	
	@Column(name="years_of_experience")
	private int experience;
	
	@Column(name="active")
	private int active;
	
	@Column(name="password")
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	public Date getMentorRegDateTime() {
		return mentorRegDateTime;
	}

	public void setMentorRegDateTime(Date mentorRegDateTime) {
		this.mentorRegDateTime = mentorRegDateTime;
	}

	public String getMentorRegCode() {
		return mentorRegCode;
	}

	public void setMentorRegCode(String mentorRegCode) {
		this.mentorRegCode = mentorRegCode;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	
	@Override
	public String toString() {
		return "MentorDetails [id=" + id + ", userName=" + userName + ", linkedinUrl=" + linkedinUrl
				+ ", mentorRegDateTime=" + mentorRegDateTime + ", mentorRegCode=" + mentorRegCode + ", experience="
				+ experience + ", active=" + active + ", password=" + password + "]";
	}

	

	public MentorDetails(Long id, String userName, String linkedinUrl, Date mentorRegDateTime, String mentorRegCode,
			int experience, int active, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.linkedinUrl = linkedinUrl;
		this.mentorRegDateTime = mentorRegDateTime;
		this.mentorRegCode = mentorRegCode;
		this.experience = experience;
		this.active = active;
		this.password = password;
	}

	public MentorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
