package com.infrrd.recruitmentmanagement;

import java.sql.Timestamp;

import com.infrrd.recruitmentmanagement.entities.CandidateDetails;
import com.infrrd.recruitmentmanagement.entities.InterviewDetails;
import com.infrrd.recruitmentmanagement.entities.SourceMasterDetails;
import com.infrrd.recruitmentmanagement.repositories.CandidateDetailsRepository;
import com.infrrd.recruitmentmanagement.repositories.InterviewDetailsRepository;


public class TestInterviewDetails
{
    public InterviewDetailsRepository interviewDetailsRepository;
    private CandidateDetails candidateDetails;

    public TestInterviewDetails( InterviewDetailsRepository interviewDetailsRepository, CandidateDetails candidate )
    {
        this.interviewDetailsRepository = interviewDetailsRepository;
        this.candidateDetails = candidate;

    }

/**
 * interview_id	int(10) unsigned
candidate_id	int(10) unsigned
employee_id	int(11)
comments	varchar(200)
round_number	int(11)
result	varchar(10)
interview_time	timestamp
interview_status	int(1)
created_on	timestamp
created_by	varchar(50)
modified_on	timestamp
modified_by	varchar(50)
 */
    public InterviewDetails testDB()
    {
        InterviewDetails interviewDetails = new InterviewDetails();
        interviewDetails.setInterviewId( 1 );
        interviewDetails.setEmployeeId( 1 );
        interviewDetails.setCandidate(candidateDetails);
        interviewDetails.setComments( "good" );
        interviewDetails.setRoundNumber( 3 );
        interviewDetails.setResult("passed");
        interviewDetails.setInterviewTime( new Timestamp( System.currentTimeMillis() ) );
        interviewDetails.setInterviewStatus( 1 );
        interviewDetails.setCreatedOn( new Timestamp( System.currentTimeMillis() ) );
        interviewDetails.setModifiedOn( new Timestamp( System.currentTimeMillis() ) );
        interviewDetails.setCreatedBy( "shivansh" );
        interviewDetails.setModifiedBy( "shivansh" );
        interviewDetails = interviewDetailsRepository.save( interviewDetails );
        System.out.println( candidateDetails.getCandidateId() );
        System.out.println( "suceesfully stored interviewdetails!" );
        return interviewDetails;

    }
}
