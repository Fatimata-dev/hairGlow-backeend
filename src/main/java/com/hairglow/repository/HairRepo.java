package com.hairglow.repository;

import com.hairglow.entity.Hair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HairRepo extends JpaRepository<Hair, Long> {
}
