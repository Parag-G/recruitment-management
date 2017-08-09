package com.infrrd.recruitmentmanagement.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "REFERRAL_DETAILS")
public class ReferralDetails implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "referral_id")
	private long referralId;

	@Column(name = "employee_id")
	private long employeeId;

	@Column(name = "emplpoyee_email_address")
	private String emplpoyeeEmailAddress;

	@OneToMany
	@JoinColumn(name = "candidate_id")
	private CandidateDetails candidate;

	@Column(name = "referral_detials_status")
	private int referralDetialsStatus;

	@Column(name = "created_on")
	private Timestamp createdOn;

	@Column(name = "modified_on")
	private Timestamp modifiedOn;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "modified_by")
	private String modifiedBy;

	public long getReferralId() {
		return referralId;
	}

	public void setReferralId(long referralId) {
		this.referralId = referralId;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmplpoyeeEmailAddress() {
		return emplpoyeeEmailAddress;
	}

	public void setEmplpoyeeEmailAddress(String emplpoyeeEmailAddress) {
		this.emplpoyeeEmailAddress = emplpoyeeEmailAddress;
	}

	public CandidateDetails getCandidate() {
		return candidate;
	}

	public void setCandidate(CandidateDetails candidate) {
		this.candidate = candidate;
	}


	public int getReferralDetialsStatus() {
		return referralDetialsStatus;
	}

	public void setReferralDetialsStatus(int referralDetialsStatus) {
		this.referralDetialsStatus = referralDetialsStatus;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Override
	public String toString() {
		return "Referral_Details [referralId=" + referralId + ", employeeId=" + employeeId + ", emplpoyeeEmailAddress="
				+ emplpoyeeEmailAddress + ", candidateId=" + candidate + ", referralDetialsStatus="
				+ referralDetialsStatus + ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn + ", createdBy="
				+ createdBy + ", modifiedBy=" + modifiedBy + "]";
	}
}
