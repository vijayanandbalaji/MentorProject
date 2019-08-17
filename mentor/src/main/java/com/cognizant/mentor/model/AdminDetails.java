package com.cognizant.mentor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_table")
public class AdminDetails {

	@Id
	private long id;
	
	@Column(name="admin_name")
	private String adminName;
	
	@Column(name="password")
	private String password;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminDetails [id=" + id + ", adminName=" + adminName + ", password=" + password + "]";
	}

	public AdminDetails(long id, String adminName, String password) {
		super();
		this.id = id;
		this.adminName = adminName;
		this.password = password;
	}

	public AdminDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

