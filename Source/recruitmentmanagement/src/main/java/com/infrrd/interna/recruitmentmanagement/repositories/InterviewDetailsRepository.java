package com.infrrd.interna.recruitmentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infrrd.interna.recruitmentmanagement.entities.InterviewDetails;
import java.util.List;


/**
 * Creating repository for Interview Details Entity
 * @author Parag
 */
public interface InterviewDetailsRepository extends JpaRepository<InterviewDetails, Long>
{
    /**
     * Getting Interview details ising Interview Id
     * @param interviewId
     * @return List of Interviews
     */
    public List<InterviewDetails> findByInterviewId( long interviewId );
}
