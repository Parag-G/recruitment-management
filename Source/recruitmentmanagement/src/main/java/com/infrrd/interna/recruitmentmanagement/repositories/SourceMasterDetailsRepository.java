package com.infrrd.interna.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.interna.recruitmentmanagement.entities.SourceMasterDetails;
import java.util.List;


/**
 * Creating repository for Source Master Entity
 * @author Parag
 */
public interface SourceMasterDetailsRepository extends JpaRepository<SourceMasterDetails, Long>
{
    /**
     * Getting the list of Source using it's Id
     * @param sourceMasterId
     * @return list of Source
     */
    public List<SourceMasterDetails> findBySourceMasterId( long sourceMasterId );
}
