package com.infrrd.recruitmentmanagement.entities;

import java.io.Serializable;
import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CANDIDATE")
public class CandidateDetails implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -7623645188372682887L;
	
	@Id
	@Column(name = "candidate_id")
	private long candidateId;
	
	@Column(name = "candidate_first_name")
	private String candidateFirstName;
	
	@Column(name = "candidate_middle_name")
	private String candidateMiddleName;
	
	@Column(name = "candidate_last_name")
	private String candidateLastName;
	
	@Column(name = "candidate_address")
	private String candidateAddress;
	
	@Column(name = "candidate_phone")
	private int candidatePhone;
	
	@Column(name = "candidate_email_address")
	private String candidateEmailAddress;
	
	@ManyToOne
	@JoinColumn(name = "source_master_id")
	private SourceMasterDetails sourceMaster;
	
	@Column(name = "created_on")
	private Timestamp createdOn;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_on")
	private Timestamp modifiedOn;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "candidate_status")
	private String candidateStatus;

	public long getCandidateId() {
		return candidateId;
	}

	public String getCandidateFirstName() {
		return candidateFirstName;
	}
	
	public void setCandidateFirstName(String candidateFirstName) {
		this.candidateFirstName = candidateFirstName;
	}

	public String getCandidateMiddleName() {
		return candidateMiddleName;
	}

	public void setCandidateMiddleName(String candidateMiddleName) {
		this.candidateMiddleName = candidateMiddleName;
	}

	public String getCandidateLastName() {
		return candidateLastName;
	}

	public void setCandidateLastName(String candidateLastName) {
		this.candidateLastName = candidateLastName;
	}

	public void setCandidateId(long candidateId) {
		this.candidateId = candidateId;
	}

	public String getCandidateAddress() {
		return candidateAddress;
	}

	public void setCandidateAddress(String candidateAddress) {
		this.candidateAddress = candidateAddress;
	}

	public int getCandidatePhone() {
		return candidatePhone;
	}

	public void setCandidatePhone(int candidatePhone) {
		this.candidatePhone = candidatePhone;
	}

	public String getCandidateEmailAddress() {
		return candidateEmailAddress;
	}

	public void setCandidateEmail(String candidateEmailAddress) {
		this.candidateEmailAddress = candidateEmailAddress;
	}

	public SourceMasterDetails getSource() {
		return sourceMaster;
	}

	public void setSource(SourceMasterDetails sourceMaster) {
		this.sourceMaster = sourceMaster;
	}

	public String getCandidateStatus() {
		return candidateStatus;
	}
	
	public void setCandidateStatus(String candidateStatus) {
		this.candidateStatus = candidateStatus;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Override
	public String toString() {
		return "CandidateDetails [candidateId=" + candidateId + ", candidateFirstName=" + candidateFirstName
				+ ", candidateMiddleName=" + candidateMiddleName + ", candidateLastName=" + candidateLastName
				+ ", candidateAddress=" + candidateAddress + ", candidatePhone=" + candidatePhone + ", candidateEmailAddress="
				+ candidateEmailAddress + ", sourceId=" + sourceMaster + ", createdOn=" + createdOn + ", createdBy=" + createdBy
				+ ", modifiedOn=" + modifiedOn + ", modifiedBy=" + modifiedBy + ", candidateStatus=" + candidateStatus
				+ "]";
	}

}