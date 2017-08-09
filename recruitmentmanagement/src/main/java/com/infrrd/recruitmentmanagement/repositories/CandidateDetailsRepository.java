package com.infrrd.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.recruitmentmanagement.entities.CandidateDetails;
import java.util.List;

public interface CandidateDetailsRepository extends JpaRepository<CandidateDetails, Long> {

	public List<CandidateDetails> findByCandidateId(long candidateId);
}
