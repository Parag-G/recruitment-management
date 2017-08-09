package com.infrrd.recruitmentmanagement.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INTERVIEWER")
public class InterviewerDetails implements Serializable {

	private static final long serialVersionUID = 854445907420332168L;

	@Id
	@GeneratedValue
	@Column(name = "interviewer_id")
	private long interviewerId;

	@Column(name = "employee_id")
	private long employeeId;

	@Column(name = "employee_email_address")
	private String employee_email_address;

	@Column(name = "skill_id")
	private long skillId;

	@Column(name = "skill_name")
	private String skillName;

	@Column(name = "round_level")
	private int round_level;

	@Column(name = "interviewer_status")
	private int interviewerStatus;

	@Column(name = "created_on")
	private Timestamp createdOn;

	@Column(name = "modified_on")
	private Timestamp modifiedOn;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "modified_by")
	private String modifiedBy;

	public long getInterviewerId() {
		return interviewerId;
	}

	public void setInterviewerId(long interviewerId) {
		this.interviewerId = interviewerId;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployee_email_address() {
		return employee_email_address;
	}

	public void setEmployee_email_address(String employee_email_address) {
		this.employee_email_address = employee_email_address;
	}

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getRound_level() {
		return round_level;
	}

	public void setRound_level(int round_level) {
		this.round_level = round_level;
	}

	public int getInterviewerStatus() {
		return interviewerStatus;
	}

	public void setInterviewerStatus(int interviewerStatus) {
		this.interviewerStatus = interviewerStatus;
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
		return "Interviewer [interviewerId=" + interviewerId + ", employeeId=" + employeeId
				+ ", employee_email_address=" + employee_email_address + ", skillId=" + skillId + ", skillName="
				+ skillName + ", round_level=" + round_level + ", interviewerStatus=" + interviewerStatus
				+ ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy
				+ ", modifiedBy=" + modifiedBy + "]";
	}

}
