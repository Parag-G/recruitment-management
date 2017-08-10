package com.infrrd.interna.recruitmentmanagement.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Creating Job Type Master
 * @author Parag
 * @author Shivansh
 * @author Harshita
 * @author Shweta
 * @author Abhishek
 * @author Murthy
 */
@Entity
@Table ( name = "JOB_TYPE_MASTER")
public class JobTypeMasterDetails implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column ( name = "job_type_master_id")
    private long jobTypeMasterId;

    @Column ( name = "job_type_name")
    private String jobTypeName;

    @Column ( name = "job_type_status")
    private int jobTypeStatus;

    @Column ( name = "created_on")
    private Timestamp createdOn;

    @Column ( name = "created_by")
    private String createdBy;

    @Column ( name = "modified_on")
    private Timestamp modifiedOn;

    @Column ( name = "modified_by")
    private String modifiedBy;


    public long getJobTypeMasterId()
    {
        return jobTypeMasterId;
    }


    public void setJobTypeMasterId( long jobTypeMasterId )
    {
        this.jobTypeMasterId = jobTypeMasterId;
    }


    public String getJobTypeName()
    {
        return jobTypeName;
    }


    public void setJobTypeName( String jobTypeName )
    {
        this.jobTypeName = jobTypeName;
    }


    public long getJobTypeStatus()
    {
        return jobTypeStatus;
    }


    public void setJobTypeStatus( int jobTypeStatus )
    {
        this.jobTypeStatus = jobTypeStatus;
    }


    public Timestamp getCreatedOn()
    {
        return createdOn;
    }


    public void setCreatedOn( Timestamp createdOn )
    {
        this.createdOn = createdOn;
    }


    public String getCreatedBy()
    {
        return createdBy;
    }


    public void setCreatedBy( String createdBy )
    {
        this.createdBy = createdBy;
    }


    public Timestamp getModifiedOn()
    {
        return modifiedOn;
    }


    public void setModifiedOn( Timestamp modifiedOn )
    {
        this.modifiedOn = modifiedOn;
    }


    public String getModifiedBy()
    {
        return modifiedBy;
    }


    public void setModifiedBy( String modifiedBy )
    {
        this.modifiedBy = modifiedBy;
    }


    @Override
    public String toString()
    {
        return "JobTypeMaster [jobTypeMasterId=" + jobTypeMasterId + ", jobTypeName=" + jobTypeName + ", jobTypeStatus="
            + jobTypeStatus + ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", modifiedOn=" + modifiedOn
            + ", modifiedBy=" + modifiedBy + "]";
    }


}