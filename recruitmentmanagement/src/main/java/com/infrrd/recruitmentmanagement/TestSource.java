package com.infrrd.recruitmentmanagement;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;

import com.infrrd.recruitmentmanagement.entities.SourceMasterDetails;
import com.infrrd.recruitmentmanagement.repositories.SourceMasterDetailsRepository;


public class TestSource


{   
    public TestSource(SourceMasterDetailsRepository sourceMasterDetailsRepository){
        this.sourceMasterDetailsRepository=sourceMasterDetailsRepository;
    }

    public SourceMasterDetailsRepository sourceMasterDetailsRepository;


 
    public void testDB()
    {
        SourceMasterDetails sourceMasterDetails = new SourceMasterDetails();
        sourceMasterDetails.setSourceMasterId( 2 );
        sourceMasterDetails.setSourceName( "FresherWorld.com" );
        sourceMasterDetails.setSourceStatus( 1 );
        sourceMasterDetails.setComments( "good" );
        sourceMasterDetails.setCreatedOn( new Timestamp( System.currentTimeMillis() ) );
        sourceMasterDetails.setCreatedBy( "parag" );
        sourceMasterDetails.setModifiedOn( new Timestamp( System.currentTimeMillis() ) );
        sourceMasterDetails.setModifiedBy( "shivansh" );

        sourceMasterDetails = sourceMasterDetailsRepository.save( sourceMasterDetails );
        System.out.println( "suceesfully stored!" );
    }

}
