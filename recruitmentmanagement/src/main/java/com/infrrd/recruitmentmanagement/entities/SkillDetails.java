package com.infrrd.recruitmentmanagement.entities;
import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "JD_REQUIRED_SKILL")

public class SkillDetails implements Serializable {
	

	@Id								
	@GeneratedValue
	@Column(name = "jd_required_skill_id")
	private int jd_required_skill_id;
	
	
	
	@Column(name = "skill_id", nullable= false)
	private long skill_id;
	
	@Column(name = "skill_name", nullable= false)
	private String skill_name;
	
	@Column(name = "jd_required_skill_status", nullable= false)
	private long jd_required_skill_status;
	
	@Column(name = "created_on", nullable= false)
	private Timestamp created_on;

	@Column(name = "modified_on", nullable= false)
	private Timestamp modified_on;

	@Column(name = "created_by", nullable= false)
	private String created_by;

	@Column(name = "modified_by", nullable= false)
	private String modified_by;

	
	
	@ManyToOne
    @JoinColumn(name = "job_description_id")
    private JOB_DESCRIPTION job_description_id;

	
	

	public int getJd_required_skill_id() {
		return jd_required_skill_id;
	}



	public void setJd_required_skill_id(int jd_required_skill_id) {
		this.jd_required_skill_id = jd_required_skill_id;
	}



	public long getSkill_id() {
		return skill_id;
	}



	public void setSkill_id(long skill_id) {
		this.skill_id = skill_id;
	}



	public String getSkill_name() {
		return skill_name;
	}



	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}



	public long getJd_required_skill_status() {
		return jd_required_skill_status;
	}



	public void setJd_required_skill_status(long jd_required_skill_status) {
		this.jd_required_skill_status = jd_required_skill_status;
	}



	public Timestamp getCreated_on() {
		return created_on;
	}



	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}



	public Timestamp getModified_on() {
		return modified_on;
	}



	public void setModified_on(Timestamp modified_on) {
		this.modified_on = modified_on;
	}



	public String getCreated_by() {
		return created_by;
	}



	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}



	public String getModified_by() {
		return modified_by;
	}



	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}



	public JOB_DESCRIPTION getJob_description_id() {
		return job_description_id;
	}



	public void setJob_description_id(JOB_DESCRIPTION job_description_id) {
		this.job_description_id = job_description_id;
	}

	@Override
	public String toString() {
		return "SKILL [jd_required_skill_id=" + jd_required_skill_id + ", job_description_id=" + job_description_id + ", skill_id=" + skill_id +","
				+ " skill_name=" + skill_name + ",jd_required_skill_status="+jd_required_skill_status+", created_by=" + created_by + ", modified_by=" + modified_by +", created_on=" + created_on + ",modified_on=" + modified_on + "]";
	}



}
