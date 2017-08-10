package com.infrrd.recruitmentmanagement;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infrrd.recruitmentmanagement.entities.JobTypeMasterDetails;
import com.infrrd.recruitmentmanagement.repositories.JobTypeMasterDetailsRepository;

@SpringBootApplication
public class RecruitmentmanagementApplication {

	public static JobTypeMasterDetailsRepository jobTypeMasterDetailsRepository;

	@Autowired
	public void setJobTypeMasterDetailsRepository(JobTypeMasterDetailsRepository jobTypeMasterDetailsRepository) {
		RecruitmentmanagementApplication.jobTypeMasterDetailsRepository = jobTypeMasterDetailsRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(RecruitmentmanagementApplication.class, args);

		JobTypeMasterDetails jobTypeMaster = new JobTypeMasterDetails();
		jobTypeMaster.setJobTypeName("abc");
		jobTypeMaster.setJobTypeStatus(1);
		jobTypeMaster.setCreatedBy("akd");
		jobTypeMaster.setCreatedOn(new Timestamp(System.currentTimeMillis()));
		jobTypeMaster.setModifiedBy("akd");
		jobTypeMaster.setModifiedOn(new Timestamp(System.currentTimeMillis()));

		jobTypeMaster = jobTypeMasterDetailsRepository.save(jobTypeMaster);
		System.out.println("Running");
	}
}
