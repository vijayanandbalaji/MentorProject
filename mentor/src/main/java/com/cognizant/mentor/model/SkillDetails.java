package com.cognizant.mentor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skill_table")
public class SkillDetails {
	
	@Id
	private Long id;
	
	@Column(name="skill_name")
	private String skillName;
	
	@Column(name="table_of_content")
	private String toc;
	
	@Column(name="duration")
	private String duration;
	
	@Column(name="pre_requites")
	private String prerequites;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getToc() {
		return toc;
	}

	public void setToc(String toc) {
		this.toc = toc;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getPrerequites() {
		return prerequites;
	}

	public void setPrerequites(String prerequites) {
		this.prerequites = prerequites;
	}

	@Override
	public String toString() {
		return "SkillDetails [id=" + id + ", skillName=" + skillName + ", toc=" + toc + ", duration=" + duration
				+ ", prerequites=" + prerequites + "]";
	}

	public SkillDetails(Long id, String skillName, String toc, String duration, String prerequites) {
		super();
		this.id = id;
		this.skillName = skillName;
		this.toc = toc;
		this.duration = duration;
		this.prerequites = prerequites;
	}

	public SkillDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
