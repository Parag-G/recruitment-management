package com.infrrd.recruitmentmanagement.entities;

import java.io.Serializable;
import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "JOB_DESCRIPTION")

public class JobDescriptionDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "job_description_id")
	private long jobDescriptionId;

//	@OneToOne
//	@JoinColumn(name="domain_master_id")
	@Column(name="domain_master_id")
	private DomainMasterDetails domainMaster;
	
	@Column(name="job_position")
	private String jobPosition;
	
	@Column(name="experience")
	private String experience;
	
	@Column(name="vacancies")
	private long vacancies;
	
//	@OneToOne
//	@JoinColumn(name="job_type_master_id")
	@Column(name="job_type_master_id")
	private JobTypeMasterDetails jobTypeMaster;

	@Column(name="job_description_status")
	private int jobDescriptionStatus;
	
	@Column(name="created_on")
	private Timestamp createdOn;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="modified_on")
	private Timestamp modifiedOn;
	
	@Column(name="modified_by")
	private String modifiedBy;

	public long getJobDescriptionId() {
		return jobDescriptionId;
	}

	public void setJobDescriptionId(long jobDescriptionId) {
		this.jobDescriptionId = jobDescriptionId;
	}
	
	public DomainMasterDetails getDomainMaster() {
		return domainMaster;
	}

	public void setDomainMaster(DomainMasterDetails domainMaster) {
		this.domainMaster = domainMaster;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public long getVacancies() {
		return vacancies;
	}

	public void setVacancies(long vacancies) {
		this.vacancies = vacancies;
	}

	public JobTypeMasterDetails getJobTypeMaster() {
		return jobTypeMaster;
	}

	public void setJobTypeMaster(JobTypeMasterDetails jobTypeMaster) {
		this.jobTypeMaster = jobTypeMaster;
	}

	public int getJobDescriptionStatus() {
		return jobDescriptionStatus;
	}

	public void setJobDescriptionStatus(int jobDescriptionStatus) {
		this.jobDescriptionStatus = jobDescriptionStatus;
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
		return "JobDescriptionDetails [jobDescriptionId=" + jobDescriptionId + ", domainMaster=" + domainMaster
				+ ", jobPosition=" + jobPosition + ", experience=" + experience + ", vacancies=" + vacancies
				+ ", jobTypeMaster=" + jobTypeMaster + ", jobDescriptionStatus=" + jobDescriptionStatus + ", createdOn="
				+ createdOn + ", createdBy=" + createdBy + ", modifiedOn=" + modifiedOn + ", modifiedBy=" + modifiedBy
				+ "]";
	}
	
	
	
}
