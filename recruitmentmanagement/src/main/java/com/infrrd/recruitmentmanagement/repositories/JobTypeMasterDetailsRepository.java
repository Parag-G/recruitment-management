package com.infrrd.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.recruitmentmanagement.entities.JobTypeMasterDetails;
import java.util.List;

public interface JobTypeMasterDetailsRepository extends JpaRepository<JobTypeMasterDetails, Long> {

	public List<JobTypeMasterDetails> findByJobTypeMasterId(long jobTypeMasterId);
}
