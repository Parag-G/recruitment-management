package com.infrrd.recruitmentmanagement.entities;

import java.io.Serializable;
import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SOURCE_MASTER")

public class SourceDetails implements Serializable{

	/**
	 * CREATE TABLE recruitment_mangement.SOURCE_MASTER (
    source_id int unsigned primary key unique auto_increment,
    source_name varchar(20) not null,
    source_status int(1) not null,
    comments varchar(50),
    created_on timestamp not null,
    created_by varchar(20) not null,
    modified_on timestamp not null,
    modified_by varchar(20) not null
);

	 */
	private static final long serialVersionUID = -3837817320550596875L;
	
	@Id
	@Column(name = "source_id")
	private long sourceId;
	@Column(name = "source_name")
	private String sourceName;
	@Column(name = "source_status")
	private int sourceStatus;
	
	@Column(name = "created_on")
	private Timestamp createdOn;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "modified_on")
	private Timestamp modifiedOn;
	@Column(name = "modified_by")
	private String modifiedBy;
	@Column(name = "comments")
	private String comments;
	
	public long getSourceId() {
		return sourceId;
	}
	public void setSourceId(long sourceId) {
		this.sourceId = sourceId;
	}
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
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
	public int getSourceStatus() {
		return sourceStatus;
	}
	public void setSourceStatus(int sourceStatus) {
		this.sourceStatus = sourceStatus;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "SourceDetails [sourceId=" + sourceId + ", sourceName=" + sourceName + ", sourceStatus=" + sourceStatus
				+ ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", modifiedOn=" + modifiedOn
				+ ", modifiedBy=" + modifiedBy + ", comments=" + comments + "]";
	}
	

}
