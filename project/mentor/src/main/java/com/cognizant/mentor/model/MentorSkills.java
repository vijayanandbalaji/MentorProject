package com.cognizant.mentor.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mentor_skill_table")
public class MentorSkills {
	
	@Id
	private long id;
	
	@OneToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="m_id" , nullable=false)
	private MentorDetails mentorDetails;
	
	
	@OneToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="s_id" , nullable=false)
	private SkillDetails skillDetails;
	
	
	@Column(name="self_rating")
	private String selfRating;
	
	@Column(name="years_of_exp")
	private String experience;
	
	@Column(name="trainings_delivered")
	private int trainingsDelivered;
	
	@Column(name="facilities_offered")
	private String facilitiesOffered;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getSelfRating() {
		return selfRating;
	}

	public void setSelfRating(String selfRating) {
		this.selfRating = selfRating;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public int getTrainingsDelivered() {
		return trainingsDelivered;
	}

	public void setTrainingsDelivered(int trainingsDelivered) {
		this.trainingsDelivered = trainingsDelivered;
	}

	public String getFacilitiesOffered() {
		return facilitiesOffered;
	}

	public void setFacilitiesOffered(String facilitiesOffered) {
		this.facilitiesOffered = facilitiesOffered;
	}

	@Override
	public String toString() {
		return "MentorSkills [id=" + id + ", mentorDetails=" + mentorDetails + ", skillDetails=" + skillDetails
				+ ", selfRating=" + selfRating + ", experience=" + experience + ", trainingsDelivered="
				+ trainingsDelivered + ", facilitiesOffered=" + facilitiesOffered + "]";
	}

	public MentorSkills(long id, MentorDetails mentorDetails, SkillDetails skillDetails, String selfRating,
			String experience, int trainingsDelivered, String facilitiesOffered) {
		super();
		this.id = id;
		this.mentorDetails = mentorDetails;
		this.skillDetails = skillDetails;
		this.selfRating = selfRating;
		this.experience = experience;
		this.trainingsDelivered = trainingsDelivered;
		this.facilitiesOffered = facilitiesOffered;
	}

	public MentorSkills() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
