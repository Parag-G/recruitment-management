package com.infrrd.recruitmentmanagement.runner;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;

import com.infrrd.recruitmentmanagement.RecruitmentmanagementApplication;
import com.infrrd.recruitmentmanagement.entities.JobTypeMasterDetails;
import com.infrrd.recruitmentmanagement.repositories.JobTypeMasterDetailsRepository;

public class InsertingValues {
	
	private JobTypeMasterDetailsRepository jobTypeMasterDetailsRepository;
	
	InsertingValues(){
		setJobTypeMasterDetailsRepository();
	}

	@Autowired
	public void setJobTypeMasterDetailsRepository(JobTypeMasterDetailsRepository jobTypeMasterDetailsRepository) {
		this.jobTypeMasterDetailsRepository = jobTypeMasterDetailsRepository;
	}
 

	public void insertIntoJobTypeMaster()//JobTypeMasterDetailsRepository jobTypeMasterDetailsRepository)
	{
		JobTypeMasterDetails jobTypeMaster = new JobTypeMasterDetails();
		jobTypeMaster.setJobTypeName("abfsdsc");
		jobTypeMaster.setJobTypeStatus(1);
		jobTypeMaster.setCreatedBy("akdsdfsfd");
		jobTypeMaster.setCreatedOn(new Timestamp(System.currentTimeMillis()));
		jobTypeMaster.setModifiedBy("aksffdsd");
		jobTypeMaster.setModifiedOn(new Timestamp(System.currentTimeMillis()));

		jobTypeMaster = jobTypeMasterDetailsRepository.save(jobTypeMaster);
		System.out.println("Running");
	}

}
