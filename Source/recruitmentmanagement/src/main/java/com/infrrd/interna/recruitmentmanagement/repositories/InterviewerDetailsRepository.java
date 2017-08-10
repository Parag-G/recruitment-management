package com.infrrd.interna.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.interna.recruitmentmanagement.entities.InterviewerDetails;
import java.util.List;


/**
 * Creating repository for Interviewer Entity
 * @author Parag
 */
public interface InterviewerDetailsRepository extends JpaRepository<InterviewerDetails, Long>
{
    /**
     * Getting List of Interviewer using the Id
     * @param interviewerId
     * @return List of Interviewers
     */
    public List<InterviewerDetails> findByInterviewerId( long interviewerId );
}
