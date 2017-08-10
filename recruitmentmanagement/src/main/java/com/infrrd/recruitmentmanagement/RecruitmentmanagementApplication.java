package com.infrrd.recruitmentmanagement;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import com.infrrd.recruitmentmanagement.entities.SourceMasterDetails;
import com.infrrd.recruitmentmanagement.repositories.SourceMasterDetailsRepository;

@SpringBootApplication
public class RecruitmentmanagementApplication {

	/**
	 * CREATE TABLE recruitment_management.SOURCE_MASTER (
    source_id int unsigned primary key auto_increment,
    source_name varchar(20) not null,
    source_status int(1) not null,
    comments varchar(50),
    created_on timestamp not null,
    created_by varchar(50) not null,
    modified_on timestamp not null,
    modified_by varchar(50) not null
);
*/
	public static SourceMasterDetailsRepository sourceMasterDetailsRepository;
	
	@Autowired
	public void setSourceMasterDetailsRepository(SourceMasterDetailsRepository sourceMasterDetailsRepository) {
		this.sourceMasterDetailsRepository = sourceMasterDetailsRepository;
	} 
	public static void main(String[] args) {
		SpringApplication.run(RecruitmentmanagementApplication.class, args);
		
	/*	SourceMasterDetails sourceMasterDetails = new SourceMasterDetails();
		sourceMasterDetails.setSourceMasterId(1);
		sourceMasterDetails.setSourceName("Naukri.com");
		sourceMasterDetails.setSourceStatus(1);
		sourceMasterDetails.setComments("good");
		sourceMasterDetails.setCreatedOn(new Timestamp(System.currentTimeMillis()));
		sourceMasterDetails.setCreatedBy("shivansh");
		sourceMasterDetails.setModifiedOn(new Timestamp(System.currentTimeMillis()));
		sourceMasterDetails.setModifiedBy("shivansh");
		
		sourceMasterDetails=sourceMasterDetailsRepository.save(sourceMasterDetails);
		System.out.println("suceesfully stored!");
*/		
		TestSource testSource = new TestSource(sourceMasterDetailsRepository);
		testSource.testDB();
		
		
	}
}
