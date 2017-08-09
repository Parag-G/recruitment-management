package com.infrrd.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.recruitmentmanagement.entities.SourceMasterDetails;
import java.util.List;

public interface SourceMasterDetailsRepository extends JpaRepository<SourceMasterDetails, Long> {

	public List<SourceMasterDetails> findBySourceMasterId(long sourceMasterId);
}
