package com.infrrd.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.recruitmentmanagement.entities.InterviewerSkillDetails;
import java.util.List;

public interface InterviewerSkillDetailsRepository extends JpaRepository<InterviewerSkillDetails, Long> {

	public List<InterviewerSkillDetails> findByInterviewerSkillId(long interviewerSkillId);
}
