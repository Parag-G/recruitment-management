package com.infrrd.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.recruitmentmanagement.entities.DomainMasterDetails;
import java.util.List;

public interface DomainMasterDetailsRepository extends JpaRepository<DomainMasterDetails, Long> {

	public List<DomainMasterDetails> findByDomainMasterId(long domainMasterId);
}
