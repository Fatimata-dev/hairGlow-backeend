package com.hairglow.repository;

import com.hairglow.entity.Steps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StepsRepo extends JpaRepository<Steps, Long> {
}
