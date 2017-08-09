package com.infrrd.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.recruitmentmanagement.entities.InterviewerDetails;
import java.util.List;

public interface InterviewerDetailsRepository extends JpaRepository<InterviewerDetails, Long> {

	public List<InterviewerDetails> findByInterviewerId(long interviewerId);
}
