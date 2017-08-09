package com.infrrd.recruitmentmanagement.entities;

import java.io.Serializable;
import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "INTERVIEW")
public class InterviewDetails implements Serializable {

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = -47849047310529694L;
	@Id
	@Column(name = "interview_id")
	private long interviewId;
	
	@OneToOne
	@JoinColumn(name = "candidate_id")
	private CandidateDetails candidate;
	
	@Column(name = "employee_id")
	private long employeeId;
	
	@Column(name = "comments")
	private String comments;
	
	@Column(name = "round_number")
	private int roundNumber;
	
	@Column(name = "result")
	private String result;
	
	@Column(name = "interview_time")
	private Timestamp interviewTime;
	
	@Column(name = "created_on")
	private Timestamp createdOn;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "modified_on")
	private Timestamp modifiedOn;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "interview_status")
	private String interviewStatus;

	public long getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(long interviewId) {
		this.interviewId = interviewId;
	}

	public CandidateDetails getCandidate() {
		return candidate;
	}

	public void setCandidate(CandidateDetails candidate) {
		this.candidate = candidate;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getRoundNumber() {
		return roundNumber;
	}

	public void setRoundNumber(int roundNumber) {
		this.roundNumber = roundNumber;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Timestamp getInterviewTime() {
		return interviewTime;
	}

	public void setInterviewTime(Timestamp interviewTime) {
		this.interviewTime = interviewTime;
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

	public String getInterviewStatus() {
		return interviewStatus;
	}

	@Override
	public String toString() {
		return "InterviewDetails [interviewId=" + interviewId + ", candidateId=" + candidate + ", employeeId="
				+ employeeId + ", comments=" + comments + ", roundNumber=" + roundNumber + ", result=" + result
				+ ", interviewTime=" + interviewTime + ", createdOn=" + createdOn + ", createdBy=" + createdBy
				+ ", modifiedOn=" + modifiedOn + ", modifiedBy=" + modifiedBy + ", interviewStatus=" + interviewStatus
				+ "]";
	}

	public void setInterviewStatus(String interviewStatus) {
		this.interviewStatus = interviewStatus;
	}

}