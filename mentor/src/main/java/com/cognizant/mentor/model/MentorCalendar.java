package com.cognizant.mentor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="mentor_calendar_table")
public class MentorCalendar {

	@Id
	private Long id;
	
	@OneToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="m_id" , nullable=false)
	private MentorDetails mentorDetails;
	
	@Column(name="start_time")
	private String startTime;
	
	@Column(name="end_time")
	private String endTime;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MentorDetails getMentorDetails() {
		return mentorDetails;
	}

	public void setMentorDetails(MentorDetails mentorDetails) {
		this.mentorDetails = mentorDetails;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "MentorCalendar [id=" + id + ", mentorDetails=" + mentorDetails + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

	public MentorCalendar(Long id, MentorDetails mentorDetails, String startTime, String endTime, Date startDate,
			Date endDate) {
		super();
		this.id = id;
		this.mentorDetails = mentorDetails;
		this.startTime = startTime;
		this.endTime = endTime;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public MentorCalendar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
