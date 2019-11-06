package com.higbie.springit.repository;

import com.higbie.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long>{

}
