package com.infrrd.interna.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.interna.recruitmentmanagement.entities.InterviewerSkillDetails;
import java.util.List;


/**
 * Creating repository for Interviewer Skill Entity
 * @author Parag
 */
public interface InterviewerSkillDetailsRepository extends JpaRepository<InterviewerSkillDetails, Long>
{
    /**
     * Getting List of Interviewer Skill using the Id
     * @param interviewerSkillId
     * @return List of Interviewer Skill
     */
    public List<InterviewerSkillDetails> findByInterviewerSkillId( long interviewerSkillId );
}
