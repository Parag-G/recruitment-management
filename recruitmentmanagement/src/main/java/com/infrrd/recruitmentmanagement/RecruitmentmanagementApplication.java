package com.infrrd.recruitmentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infrrd.recruitmentmanagement.repositories.JobTypeMasterDetailsRepository;
import com.infrrd.recruitmentmanagement.runner.InsertingValues;

@SpringBootApplication
public class RecruitmentmanagementApplication {

	/*public static JobTypeMasterDetailsRepository jobTypeMasterDetailsRepository;

	@Autowired
	public void setJobTypeMasterDetailsRepository(JobTypeMasterDetailsRepository jobTypeMasterDetailsRepository) {
		RecruitmentmanagementApplication.jobTypeMasterDetailsRepository = jobTypeMasterDetailsRepository;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(RecruitmentmanagementApplication.class, args);
		InsertingValues insertingValues = new InsertingValues();
		insertingValues.insertIntoJobTypeMaster();//jobTypeMasterDetailsRepository);
	}
}
