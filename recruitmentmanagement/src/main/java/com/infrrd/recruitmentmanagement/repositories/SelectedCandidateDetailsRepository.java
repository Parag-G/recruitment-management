package com.infrrd.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.recruitmentmanagement.entities.SelectedCandidateDetails;
import java.util.List;

public interface SelectedCandidateDetailsRepository extends JpaRepository<SelectedCandidateDetails, Long> {

	public List<SelectedCandidateDetails> findBySelectedCandidateId(long selectedCandidatId);
}
