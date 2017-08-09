package com.infrrd.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.recruitmentmanagement.entities.JobDescriptionDetails;
import java.util.List;

public interface JobDescriptionDetailsRepository extends JpaRepository<JobDescriptionDetails, Long> {

	public List<JobDescriptionDetails> findByJobDescriptionId(long jobDescriptionId);
}
