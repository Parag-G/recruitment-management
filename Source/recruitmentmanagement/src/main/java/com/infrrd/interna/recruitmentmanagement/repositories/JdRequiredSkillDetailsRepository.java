package com.infrrd.interna.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.interna.recruitmentmanagement.entities.JdRequiredSkillDetails;
import java.util.List;


/**
 * Creating repository for Job Desscription Required Skill
 * @author Parag
 */
public interface JdRequiredSkillDetailsRepository extends JpaRepository<JdRequiredSkillDetails, Long>
{
    /**
     * Getting the list of Job Description Required Skill using the Id
     * @param jdRequiredSkillId
     * @return List of Job Description Required Skill
     */
    public List<JdRequiredSkillDetails> findByJdRequiredSkillId( long jdRequiredSkillId );
}
