package com.infrrd.interna.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.interna.recruitmentmanagement.entities.JobTypeMasterDetails;
import java.util.List;


/**
 * Creating repository for Job Type Master Entity
 * @author Parag
 */
public interface JobTypeMasterDetailsRepository extends JpaRepository<JobTypeMasterDetails, Long>
{
    /**
     * Getting the list of Job Types using Id
     * @param jobTypeMasterId
     * @return list of Job Types
     */
    public List<JobTypeMasterDetails> findByJobTypeMasterId( long jobTypeMasterId );
}
