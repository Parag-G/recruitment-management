package com.infrrd.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.recruitmentmanagement.entities.InterviewDetails;
import java.util.List;

public interface InterviewDetailsRepository extends JpaRepository<InterviewDetails, Long> {

	public List<InterviewDetails> findByInterviewId(long interviewId);
}
