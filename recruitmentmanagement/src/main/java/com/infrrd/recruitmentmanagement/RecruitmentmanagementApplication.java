package com.infrrd.recruitmentmanagement;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import com.infrrd.recruitmentmanagement.entities.CandidateDetails;
import com.infrrd.recruitmentmanagement.entities.SourceMasterDetails;
import com.infrrd.recruitmentmanagement.repositories.CandidateDetailsRepository;
import com.infrrd.recruitmentmanagement.repositories.InterviewDetailsRepository;
import com.infrrd.recruitmentmanagement.repositories.SourceMasterDetailsRepository;


@SpringBootApplication
public class RecruitmentmanagementApplication
{


    public static SourceMasterDetailsRepository sourceMasterDetailsRepository;
    public static CandidateDetailsRepository candidateDetailsRepository;
    public static InterviewDetailsRepository interviewDetailsRepository;


    @Autowired
    public void setSourceMasterDetailsRepository( SourceMasterDetailsRepository sourceMasterDetailsRepository )
    {
        this.sourceMasterDetailsRepository = sourceMasterDetailsRepository;
    }


    @Autowired
    public void setCandidateDetailsRepository( CandidateDetailsRepository candidateDetailsRepository )
    {
        RecruitmentmanagementApplication.candidateDetailsRepository = candidateDetailsRepository;
    }


    @Autowired
    public void setInterviewDetailsRepository( InterviewDetailsRepository interviewDetailsRepository )
    {
        RecruitmentmanagementApplication.interviewDetailsRepository = interviewDetailsRepository;
    }


    public static void main( String[] args )
    {
        SpringApplication.run( RecruitmentmanagementApplication.class, args );
        SourceMasterDetails sourceMasterDetails;
        CandidateDetails candidateDetails;

        TestSource testSource = new TestSource( sourceMasterDetailsRepository );
        sourceMasterDetails = testSource.testDB();

        TestCandidateDetails testCandidateDetails = new TestCandidateDetails( candidateDetailsRepository, sourceMasterDetails );
        candidateDetails=testCandidateDetails.testDB();
        //System.out.println(candidateDetails.getCandidateId());
        TestInterviewDetails interviewDetails = new TestInterviewDetails( interviewDetailsRepository , candidateDetails );
        interviewDetails.testDB();


    }
}
