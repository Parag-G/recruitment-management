package com.infrrd.recruitmentmanagement;

import java.sql.Timestamp;

import com.infrrd.recruitmentmanagement.entities.CandidateDetails;
import com.infrrd.recruitmentmanagement.entities.SourceMasterDetails;
import com.infrrd.recruitmentmanagement.repositories.CandidateDetailsRepository;


public class TestCandidateDetails

{

    private CandidateDetailsRepository candidateDetailsRepository;
    private SourceMasterDetails sourceMasterDetails;


    public TestCandidateDetails( CandidateDetailsRepository candidateDetailsRepository,
        SourceMasterDetails sourceMasterDetails )
    {
        this.candidateDetailsRepository = candidateDetailsRepository;
        this.sourceMasterDetails = sourceMasterDetails;
    }


    /**
     * CREATE TABLE recruitment_management.CANDIDATE (
    candidate_id int unsigned primary key auto_increment,
    candidate_first_name varchar(30) not null,
    candidate_middle_name varchar(30),
    candidate_last_name varchar(30) not null,
    candidate_address varchar(500) not null,
    candidate_phone varchar(30) not null,
    candidate_email_address varchar(50) not null,
    source_id int unsigned not null,
    candidate_status int(1) not null,
    created_on timestamp not null,
    created_by varchar(50) not null,
    modified_on timestamp not null,
    modified_by varchar(50) not null,
    foreign key (source_id)
        references SOURCE_MASTER (source_id)
    );
    
     */

    public CandidateDetails testDB()
    {
        CandidateDetails candidateDetails = new CandidateDetails();

        candidateDetails.setCandidateId( 1 );
        candidateDetails.setCandidateFirstName( "Parag" );
        candidateDetails.setCandidateLastName( "agarwal" );
        candidateDetails.setCandidateMiddleName( "pata ni" );
        candidateDetails.setCandidateAddress( "BLR" );
        candidateDetails.setCandidatePhone( "8989022220" );
        candidateDetails.setCandidateEmail( "shivansh@infrrd.ai" );
        candidateDetails.setSource( sourceMasterDetails );
        candidateDetails.setCandidateStatus( 1 );
        candidateDetails.setCreatedOn( new Timestamp( System.currentTimeMillis() ) );
        candidateDetails.setModifiedOn( new Timestamp( System.currentTimeMillis() ) );
        candidateDetails.setCreatedBy( "shivansh" );
        candidateDetails.setModifiedBy( "shivansh" );
        candidateDetails= candidateDetailsRepository.save(candidateDetails);
        System.out.println( "suceesfully stored !" );
        return candidateDetails;

    }

}
