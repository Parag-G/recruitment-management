package com.infrrd.interna.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.interna.recruitmentmanagement.entities.DomainMasterDetails;
import java.util.List;


/**
 * Creating repository for Domain Master Entity
 * @author Parag
 */
public interface DomainMasterDetailsRepository extends JpaRepository<DomainMasterDetails, Long>
{
    /**
     * Gettin Domain using domain Id
     * @param domainMasterId
     * @return List of Domains
     */
    public List<DomainMasterDetails> findByDomainMasterId( long domainMasterId );
}
