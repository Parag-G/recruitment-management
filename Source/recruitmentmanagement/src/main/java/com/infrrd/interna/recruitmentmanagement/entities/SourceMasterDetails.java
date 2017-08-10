package com.infrrd.interna.recruitmentmanagement.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Creating Source Master Entity
 * @author Parag
 * @author Shivansh
 * @author Harshita
 * @author Shweta
 * @author Abhishek
 * @author Murthy
 */
@Entity
@Table ( name = "SOURCE_MASTER")

public class SourceMasterDetails implements Serializable
{
    private static final long serialVersionUID = -3837817320550596875L;

    @Id
    @GeneratedValue
    @Column ( name = "source_master_id")
    private long sourceMasterId;

    @Column ( name = "source_name")
    private String sourceName;

    @Column ( name = "source_status")
    private int sourceStatus;

    @Column ( name = "created_on")
    private Timestamp createdOn;

    @Column ( name = "created_by")
    private String createdBy;

    @Column ( name = "modified_on")
    private Timestamp modifiedOn;

    @Column ( name = "modified_by")
    private String modifiedBy;

    @Column ( name = "comments")
    private String comments;


    public long getSourceMasterId()
    {
        return sourceMasterId;
    }


    public void setSourceMasterId( long sourceMasterId )
    {
        this.sourceMasterId = sourceMasterId;
    }


    public String getSourceName()
    {
        return sourceName;
    }


    public void setSourceName( String sourceName )
    {
        this.sourceName = sourceName;
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


    public int getSourceStatus()
    {
        return sourceStatus;
    }


    public void setSourceStatus( int sourceStatus )
    {
        this.sourceStatus = sourceStatus;
    }


    public String getComments()
    {
        return comments;
    }


    public void setComments( String comments )
    {
        this.comments = comments;
    }


    @Override
    public String toString()
    {
        return "SourceDetails [sourceMasterId=" + sourceMasterId + ", sourceName=" + sourceName + ", sourceStatus="
            + sourceStatus + ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", modifiedOn=" + modifiedOn
            + ", modifiedBy=" + modifiedBy + ", comments=" + comments + "]";
    }

}
