package com.higbie.springit.repository;

import com.higbie.springit.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRespository extends JpaRepository<Vote, Long> {
}
