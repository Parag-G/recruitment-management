package com.infrrd.interna.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.interna.recruitmentmanagement.entities.ReferralDetails;
import java.util.List;


/**
 * Creating repository for Repository Details Entity
 * @author Parag
 */
public interface ReferralDetailsRepository extends JpaRepository<ReferralDetails, Long>
{
    /**
     * Getting the list of Referral Details using it's Id
     * @param referralId
     * @return list of Referral Details
     */
    public List<ReferralDetails> findByReferralId( long referralId );
}
