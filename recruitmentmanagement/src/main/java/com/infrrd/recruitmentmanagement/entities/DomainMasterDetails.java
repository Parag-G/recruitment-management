package com.infrrd.recruitmentmanagement.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DOMAIN_MASTER")
public class DomainMasterDetails implements Serializable {

	private static final long serialVersionUID = 854445907420332168L;

	@Id
	@GeneratedValue
	@Column(name = "domain_master_id")
	private long domainMasterId;

	@Column(name = "domain_name")
	private String domainName;

	@Column(name = "domain_status")
	private long domainStatus;

	@Column(name = "created_on")
	private Timestamp createdOn;

	@Column(name = "modified_on")
	private Timestamp modifiedOn;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "modified_by")
	private String modifiedBy;

	public long getDomainMasterId() {
		return domainMasterId;
	}

	public void setDomain_Id(long domainMasterId) {
		this.domainMasterId = domainMasterId;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomain_name(String domainName) {
		this.domainName = domainName;
	}

	public long getDomainStatus() {
		return domainStatus;
	}

	public void setDomainStatus(int domainStatus) {
		this.domainStatus = domainStatus;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DomainDetails [domain_Id=" + domainMasterId + ", domain_name=" + domainName + ", domainStatus=" + domainStatus
				+ ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn + ", createdBy=" + createdBy
				+ ", modifiedBy=" + modifiedBy + "]";
	}

}
