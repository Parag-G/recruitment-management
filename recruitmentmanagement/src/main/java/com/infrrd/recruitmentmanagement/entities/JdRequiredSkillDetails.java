package com.infrrd.recruitmentmanagement.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "JD_REQUIRED_SKILL")

public class JdRequiredSkillDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6183991794841445977L;

	@Id
	@GeneratedValue
	@Column(name = "jd_required_skill_id")
	private long jdRequiredSkillId;

	@Column(name = "skill_id")
	private long skillId;

	@Column(name = "skill_name")
	private String skillName;

	@Column(name = "jd_required_skill_status")
	private long jdRequiredSkillStatus;

	@Column(name = "created_on")
	private Timestamp createdOn;

	@Column(name = "modified_on")
	private Timestamp modifiedOn;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "modified_by")
	private String modifiedBy;

//	@ManyToMany
//	@JoinColumn(name = "job_description_id")
	@Column(name = "job_description_id")
	private JobDescriptionDetails jobDescription;

	public long getJdRequiredSkillId() {
		return jdRequiredSkillId;
	}

	public void setJdRequiredSkillId(long jdRequiredSkillId) {
		this.jdRequiredSkillId = jdRequiredSkillId;
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

	public long getJdRequiredSkillStatus() {
		return jdRequiredSkillStatus;
	}

	public void setJdRequiredSkillStatus(long jdRequiredSkillStatus) {
		this.jdRequiredSkillStatus = jdRequiredSkillStatus;
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

	public JobDescriptionDetails getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(JobDescriptionDetails jobDescription) {
		this.jobDescription = jobDescription;
	}

	@Override
	public String toString() {
		return "JdRequiredSkillDetails [jdRequiredSkillId=" + jdRequiredSkillId + ", skillId=" + skillId
				+ ", skillName=" + skillName + ", jdRequiredSkillStatus=" + jdRequiredSkillStatus + ", createdOn="
				+ createdOn + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy
				+ ", jobDescription=" + jobDescription + "]";
	}

}
