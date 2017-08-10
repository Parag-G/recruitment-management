package com.infrrd.interna.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.interna.recruitmentmanagement.entities.JobDescriptionDetails;
import java.util.List;


/**
 * Creating repository for Job Description Entity
 * @author Parag
 */
public interface JobDescriptionDetailsRepository extends JpaRepository<JobDescriptionDetails, Long>
{
    /**
     * Getting the list of Job Description using Id
     * @param jobDescriptionId
     * @return list of Job Description
     */
    public List<JobDescriptionDetails> findByJobDescriptionId( long jobDescriptionId );
}
