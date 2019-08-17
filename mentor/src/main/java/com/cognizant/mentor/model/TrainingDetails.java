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
@Table(name="training_table")
public class TrainingDetails {
	
	
	@Id
	private Long id;
	
	@OneToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="user_id" , nullable=false)
	private UserDetails userDetails;
	
	
	@OneToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="mentor_id" , nullable=false)
	private MentorDetails mentorDetails;
	
	@OneToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="skill_id" , nullable=false)
	private SkillDetails skillDetails;
	
	
	@Column(name="status")
	private String status;
	
	@Column(name="progress")
	private String progress;
	
	
	@Column(name="rating")
	private String rating;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="start_time")
	private String startTime;
	
	@Column(name="end_time")
	private String endTime;
	
	@Column(name="amount_received")
	private int amountReceived;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public MentorDetails getMentorDetails() {
		return mentorDetails;
	}

	public void setMentorDetails(MentorDetails mentorDetails) {
		this.mentorDetails = mentorDetails;
	}

	public SkillDetails getSkillDetails() {
		return skillDetails;
	}

	public void setSkillDetails(SkillDetails skillDetails) {
		this.skillDetails = skillDetails;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
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

	public int getAmountReceived() {
		return amountReceived;
	}

	public void setAmountReceived(int amountReceived) {
		this.amountReceived = amountReceived;
	}

	@Override
	public String toString() {
		return "TrainingDetails [id=" + id + ", userDetails=" + userDetails + ", mentorDetails=" + mentorDetails
				+ ", skillDetails=" + skillDetails + ", status=" + status + ", progress=" + progress + ", rating="
				+ rating + ", startDate=" + startDate + ", endDate=" + endDate + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", amountReceived=" + amountReceived + "]";
	}

	public TrainingDetails(Long id, UserDetails userDetails, MentorDetails mentorDetails, SkillDetails skillDetails,
			String status, String progress, String rating, Date startDate, Date endDate, String startTime,
			String endTime, int amountReceived) {
		super();
		this.id = id;
		this.userDetails = userDetails;
		this.mentorDetails = mentorDetails;
		this.skillDetails = skillDetails;
		this.status = status;
		this.progress = progress;
		this.rating = rating;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.amountReceived = amountReceived;
	}

	public TrainingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
