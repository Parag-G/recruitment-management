package com.infrrd.interna.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.interna.recruitmentmanagement.entities.CandidateDetails;
import java.util.List;


/**
 * Creating Repository for Candidate Entity
 * @author Parag
 */
public interface CandidateDetailsRepository extends JpaRepository<CandidateDetails, Long>
{
    /**
     * Getting Candidate by Id
     * @param candidateId
     * @return List of candidates
     */
    public List<CandidateDetails> findByCandidateId( long candidateId );
}
