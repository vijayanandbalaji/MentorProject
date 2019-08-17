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
@Table(name="payment_table")
public class PaymentDetails {
	
	@Id
	private long id;
	
	@OneToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="mentor_id" , nullable=false)
	private MentorDetails mentorDetails;
	
	@OneToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="training_id" , nullable=false)
	private TrainingDetails trainingDetails;
	
	@Column(name="txn_type")
	private String txnType;
	
	@Column(name="amount")
	private String amount;
	
	@Column(name="date_time")
	private Date dateTime;
	
	@Column(name="remarks")
	private String remarks;

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

	public TrainingDetails getTrainingDetails() {
		return trainingDetails;
	}

	public void setTrainingDetails(TrainingDetails trainingDetails) {
		this.trainingDetails = trainingDetails;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "PaymentDetails [id=" + id + ", mentorDetails=" + mentorDetails + ", trainingDetails=" + trainingDetails
				+ ", txnType=" + txnType + ", amount=" + amount + ", dateTime=" + dateTime + ", remarks=" + remarks
				+ "]";
	}

	public PaymentDetails(long id, MentorDetails mentorDetails, TrainingDetails trainingDetails, String txnType,
			String amount, Date dateTime, String remarks) {
		super();
		this.id = id;
		this.mentorDetails = mentorDetails;
		this.trainingDetails = trainingDetails;
		this.txnType = txnType;
		this.amount = amount;
		this.dateTime = dateTime;
		this.remarks = remarks;
	}

	public PaymentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
