package com.infrrd.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.recruitmentmanagement.entities.JdRequiredSkillDetails;
import java.util.List;

public interface JdRequiredSkillDetailsRepository extends JpaRepository<JdRequiredSkillDetails, Long> {

	public List<JdRequiredSkillDetails> findByJdRequiredSkillId(long jdRequiredSkillId);
}
