package com.infrrd.interna.recruitmentmanagement.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * Creating Selected Candidate Entity
 * @author Parag
 * @author Shivansh
 * @author Harshita
 * @author Shweta
 * @author Abhishek
 * @author Murthy
 */
@Entity
@Table ( name = "SELECTED_CANDIDATE")
public class SelectedCandidateDetails implements Serializable
{

    /**
    * 
    */
    private static final long serialVersionUID = 3901550970026436485L;

    @Id
    @GeneratedValue
    @Column ( name = "selected_candidate_id")
    private long selectedCandidateId;

    @OneToOne
    @JoinColumn ( name = "candidate_id")
    private CandidateDetails candidate;

    @Column ( name = "joining_status")
    private int joiningStatus;

    @Column ( name = "expected_joining_date")
    private Timestamp expectedJoiningDate;

    @Column ( name = "comments")
    private String comments;

    @Column ( name = "offer_letter_sent_status")
    private int offerLetterSentStatus;

    @Column ( name = "offer_letter_sent_on")
    private Timestamp offerLetterSentOn;

    @Column ( name = "selected_candidate_status")
    private int selectedCandidateStatus;

    @Column ( name = "created_on")
    private Timestamp createdOn;

    @Column ( name = "modified_on")
    private Timestamp modifiedOn;

    @Column ( name = "created_by")
    private String createdBy;

    @Column ( name = "modified_by")
    private String modifiedBy;


    public long getSelectedCandidateId()
    {
        return selectedCandidateId;
    }


    public void setSelectedCandidateId( long selectedCandidateId )
    {
        this.selectedCandidateId = selectedCandidateId;
    }


    public CandidateDetails getCandidate()
    {
        return candidate;
    }


    public void setCandidate( CandidateDetails candidate )
    {
        this.candidate = candidate;
    }


    public int getJoiningStatus()
    {
        return joiningStatus;
    }


    public void setJoiningStatus( int joiningStatus )
    {
        this.joiningStatus = joiningStatus;
    }


    public Timestamp getExpectedJoiningDate()
    {
        return expectedJoiningDate;
    }


    public void setExpectedJoiningDate( Timestamp expectedJoiningDate )
    {
        this.expectedJoiningDate = expectedJoiningDate;
    }


    public String getComments()
    {
        return comments;
    }


    public void setComments( String comments )
    {
        this.comments = comments;
    }


    public int getOfferLetterSentStatus()
    {
        return offerLetterSentStatus;
    }


    public void setOfferLetterSentStatus( int offerLetterSentStatus )
    {
        this.offerLetterSentStatus = offerLetterSentStatus;
    }


    public Timestamp getOfferLetterSentOn()
    {
        return offerLetterSentOn;
    }


    public void setOfferLetterSentOn( Timestamp offerLetterSentOn )
    {
        this.offerLetterSentOn = offerLetterSentOn;
    }


    public int getSelectedCandidateStatus()
    {
        return selectedCandidateStatus;
    }


    public void setSelectedCandidateStatus( int selectedCandidateStatus )
    {
        this.selectedCandidateStatus = selectedCandidateStatus;
    }


    public Timestamp getCreatedOn()
    {
        return createdOn;
    }


    public void setCreatedOn( Timestamp createdOn )
    {
        this.createdOn = createdOn;
    }


    public Timestamp getModifiedOn()
    {
        return modifiedOn;
    }


    public void setModifiedOn( Timestamp modifiedOn )
    {
        this.modifiedOn = modifiedOn;
    }


    public String getCreatedBy()
    {
        return createdBy;
    }


    public void setCreatedBy( String createdBy )
    {
        this.createdBy = createdBy;
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
        return "SelectedCandidateDetails [selectedCandidateId=" + selectedCandidateId + ", candidate=" + candidate
            + ", joiningStatus=" + joiningStatus + ", expectedJoiningDate=" + expectedJoiningDate + ", comments=" + comments
            + ", offerLetterSentStatus=" + offerLetterSentStatus + ", offerLetterSentOn=" + offerLetterSentOn
            + ", selectedCandidateStatus=" + selectedCandidateStatus + ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn
            + ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy + "]";
    }

}
