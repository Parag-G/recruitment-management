package com.infrrd.interna.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.interna.recruitmentmanagement.entities.SelectedCandidateDetails;
import java.util.List;


/**
 * Creating repository for Selected Candidate Entity
 * @author Parag
 */
public interface SelectedCandidateDetailsRepository extends JpaRepository<SelectedCandidateDetails, Long>
{
    /**
     * Getting list of Selected Candidates using it's Id
     * @param selectedCandidatId
     * @return List of Selected Candidates
     */
    public List<SelectedCandidateDetails> findBySelectedCandidateId( long selectedCandidatId );
}
