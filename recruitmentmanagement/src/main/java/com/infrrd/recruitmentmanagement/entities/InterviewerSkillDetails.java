package com.infrrd.recruitmentmanagement.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INTERVIEWER_SKILL")
public class InterviewerSkillDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "interviewer_skill_id")
	private long interviewerSkillId;

	@Column(name = "interviewer_id")
	private long interviewerId;

	@Column(name = "skill_id")
	private long skillId;

	@Column(name = "skill_name")
	private long skillName;

	@Column(name = "created_on")
	private Timestamp createdOn;

	@Column(name = "modified_on")
	private Timestamp modifiedOn;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "interviewer_skill_status")
	private int interviewerSkillStatus;

	public long getInterviewerSkillId() {
		return interviewerSkillId;
	}

	public void setInterviewerSkillId(long interviewerSkillId) {
		this.interviewerSkillId = interviewerSkillId;
	}

	public long getInterviewerId() {
		return interviewerId;
	}

	public void setInterviewerId(long interviewerId) {
		this.interviewerId = interviewerId;
	}

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public long getSkillName() {
		return skillName;
	}

	public void setSkillName(long skillName) {
		this.skillName = skillName;
	}

	public long getInterviewerSkillStatus() {
		return interviewerSkillStatus;
	}

	public void setInterviewerSkillStatus(int interviewerSkillStatus) {
		this.interviewerSkillStatus = interviewerSkillStatus;
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
		return "InterviewerSkill [interviewerSkillId=" + interviewerSkillId + ", interviewerId=" + interviewerId
				+ ", skillId=" + skillId + ", skillName=" + skillName + ", interviewerSkillStatus="
				+ interviewerSkillStatus + ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn + ", createdBy="
				+ createdBy + ", modifiedBy=" + modifiedBy + "]";
	}

}
