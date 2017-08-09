package com.infrrd.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.recruitmentmanagement.entities.ReferralDetails;
import java.util.List;

public interface ReferralDetailsRepository extends JpaRepository<ReferralDetails, Long> {

	public List<ReferralDetails> findByReferralId(long referralId);
}
